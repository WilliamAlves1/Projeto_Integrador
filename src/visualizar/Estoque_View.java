package visualizar;

import DAO.Produto_DAO;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import modelos.Produto;

public class Estoque_View extends JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Estoque_View.class.getName());

    private final Color COLOR_BG = new Color(243, 246, 249);
    private final Color COLOR_CARD = Color.WHITE;
    private final Color COLOR_TITLE = new Color(33, 37, 41);
    private final Color COLOR_LABEL = new Color(73, 80, 87);
    private final Color COLOR_BORDER = new Color(206, 212, 218);
    private final Color BTN_PRIMARY = new Color(13, 110, 253);
    private final Color BTN_SUCCESS = new Color(25, 135, 84);
    private final Color BTN_DANGER = new Color(220, 53, 69);
    private final Color BTN_WARNING = new Color(255, 193, 7);
    private final Color BTN_SECONDARY = new Color(108, 117, 125);

    private final Font FONT_TITLE = new Font("Segoe UI", Font.BOLD, 26);
    private final Font FONT_LABEL = new Font("Segoe UI", Font.BOLD, 14);
    private final Font FONT_INPUT = new Font("Segoe UI", Font.PLAIN, 16);

    private JTextField textIDP, textNome, textPreco, textCategoria, textQtde, textImg;
    private JTextField textPeso, textComprimento, textLargura, textAltura;
    private JButton addButton, altButton, delButton, readButton, returnButton;

    public Estoque_View() {
        initComponents();
        setTitle("Sistema DahoDB - Controle de Estoque");
        setSize(1700, 1000);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(COLOR_BG);

        JPanel cardPanel = new JPanel(new GridBagLayout());
        cardPanel.setBackground(COLOR_CARD);
        cardPanel.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0, 20), 1), new EmptyBorder(30, 40, 30, 40)));

        GridBagConstraints mainGbc = new GridBagConstraints();
        mainGbc.gridx = 0;
        mainGbc.gridy = 0;
        mainGbc.fill = GridBagConstraints.BOTH;
        mainGbc.weightx = 1.0;
        mainGbc.weighty = 1.0;
        mainGbc.insets = new Insets(30, 30, 30, 30);
        mainPanel.add(cardPanel, mainGbc);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTHWEST;

        JLabel lblTitle = new JLabel("Controle de Estoque");
        lblTitle.setFont(FONT_TITLE);
        lblTitle.setForeground(COLOR_TITLE);

        JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        headerPanel.setBackground(COLOR_CARD);
        headerPanel.add(lblTitle);
        headerPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(230, 230, 230)));

        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 4; gbc.weightx = 1.0;
        gbc.insets = new Insets(0, 0, 30, 0);
        cardPanel.add(headerPanel, gbc);

        gbc.insets = new Insets(5, 10, 5, 10);

        gbc.gridwidth = 1; gbc.gridy++; gbc.gridx = 0; gbc.weightx = 0.0;
        cardPanel.add(createLabel("ID Produto:"), gbc);

        textIDP = createTextField();
        gbc.gridx = 1; gbc.weightx = 0.2;
        cardPanel.add(textIDP, gbc);

        readButton = createButton("Pesquisar", BTN_PRIMARY, Color.WHITE);
        gbc.gridx = 2; gbc.weightx = 0.0;
        cardPanel.add(readButton, gbc);

        gbc.gridx = 3; gbc.weightx = 1.0;
        cardPanel.add(Box.createGlue(), gbc);

        gbc.gridy++; gbc.gridx = 0; gbc.weightx = 0.0;
        cardPanel.add(createLabel("Nome do Produto:"), gbc);

        textNome = createTextField();
        gbc.gridx = 1; gbc.gridwidth = 3; gbc.weightx = 1.0;
        cardPanel.add(textNome, gbc);

        gbc.gridwidth = 1; gbc.gridy++; gbc.gridx = 0; gbc.weightx = 0.0;
        cardPanel.add(createLabel("Preço (R$):"), gbc);

        textPreco = createTextField();
        gbc.gridx = 1; gbc.weightx = 1.0;
        cardPanel.add(textPreco, gbc);

        gbc.gridx = 2; gbc.weightx = 0.0;
        cardPanel.add(createLabel("Categoria:"), gbc);

        textCategoria = createTextField();
        gbc.gridx = 3; gbc.weightx = 1.0;
        cardPanel.add(textCategoria, gbc);

        gbc.gridy++; gbc.gridx = 0; gbc.weightx = 0.0;
        cardPanel.add(createLabel("Quantidade:"), gbc);

        textQtde = createTextField();
        gbc.gridx = 1; gbc.weightx = 1.0;
        cardPanel.add(textQtde, gbc);

        gbc.gridx = 2; gbc.weightx = 0.0;
        cardPanel.add(createLabel("Link da Imagem:"), gbc);

        textImg = createTextField();
        gbc.gridx = 3; gbc.weightx = 1.0;
        cardPanel.add(textImg, gbc);

        gbc.gridy++; gbc.gridx = 0; gbc.gridwidth = 4;
        gbc.insets = new Insets(25, 10, 10, 10);
        JLabel lblDim = new JLabel("Dimensões e Logística");
        lblDim.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblDim.setForeground(BTN_PRIMARY);
        cardPanel.add(lblDim, gbc);

        gbc.insets = new Insets(5, 10, 5, 10);
        JPanel dimPanel = new JPanel(new GridLayout(1, 4, 15, 0));
        dimPanel.setBackground(COLOR_CARD);

        dimPanel.add(createDimField("Peso (kg):", textPeso = createTextField()));
        dimPanel.add(createDimField("Comp. (cm):", textComprimento = createTextField()));
        dimPanel.add(createDimField("Larg. (cm):", textLargura = createTextField()));
        dimPanel.add(createDimField("Alt. (cm):", textAltura = createTextField()));

        gbc.gridy++;
        cardPanel.add(dimPanel, gbc);

        JPanel spacer = new JPanel();
        spacer.setBackground(COLOR_CARD);
        gbc.gridy++; gbc.weighty = 1.0;
        cardPanel.add(spacer, gbc);

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        btnPanel.setBackground(COLOR_CARD);
        btnPanel.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, COLOR_BORDER));

        JPanel padBtnPanel = new JPanel(new BorderLayout());
        padBtnPanel.setBackground(COLOR_CARD);
        padBtnPanel.setBorder(new EmptyBorder(20,0,0,0));

        addButton = createButton(" Cadastrar ", BTN_SUCCESS, Color.WHITE);
        altButton = createButton(" Salvar Alterações ", BTN_WARNING, Color.DARK_GRAY);
        delButton = createButton(" Excluir ", BTN_DANGER, Color.WHITE);
        returnButton = createButton(" Voltar ", BTN_SECONDARY, Color.WHITE);

        btnPanel.add(returnButton);
        btnPanel.add(delButton);
        btnPanel.add(altButton);
        btnPanel.add(addButton);

        padBtnPanel.add(btnPanel, BorderLayout.CENTER);

        gbc.gridy++; gbc.weighty = 0.0;
        cardPanel.add(padBtnPanel, gbc);

        mainPanel.add(cardPanel, mainGbc);
        setContentPane(mainPanel);

        addButton.addActionListener(this::addButtonActionPerformed);
        altButton.addActionListener(this::altButtonActionPerformed);
        delButton.addActionListener(this::delButtonActionPerformed);
        readButton.addActionListener(this::readButtonActionPerformed);
        returnButton.addActionListener(this::returnButtonActionPerformed);
    }

    private JPanel createDimField(String label, JTextField field) {
        JPanel p = new JPanel(new BorderLayout(0, 5));
        p.setBackground(COLOR_CARD);
        JLabel l = new JLabel(label);
        l.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        l.setForeground(COLOR_LABEL);
        p.add(l, BorderLayout.NORTH);
        p.add(field, BorderLayout.CENTER);
        return p;
    }

    private JLabel createLabel(String text) {
        JLabel lbl = new JLabel(text);
        lbl.setFont(FONT_LABEL);
        lbl.setForeground(COLOR_LABEL);
        return lbl;
    }

    private JTextField createTextField() {
        JTextField txt = new JTextField();
        txt.setFont(FONT_INPUT);
        txt.setForeground(Color.BLACK);
        txt.setBackground(Color.WHITE);
        txt.setBorder(new CompoundBorder(
                new LineBorder(COLOR_BORDER, 1),
                new EmptyBorder(8, 10, 8, 10)
        ));
        return txt;
    }

    private JButton createButton(String text, Color bg, Color fg) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btn.setForeground(fg);
        btn.setBackground(bg);
        btn.setFocusPainted(false);
        btn.setBorder(new EmptyBorder(10, 20, 10, 20));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { btn.setBackground(bg.darker()); }
            public void mouseExited(MouseEvent evt) { btn.setBackground(bg); }
        });
        return btn;
    }

    private void addButtonActionPerformed(ActionEvent evt) {
        try {
            Produto p = new Produto();
            p.setNomeProduto(textNome.getText());
            p.setPreco(Double.parseDouble(textPreco.getText().replace(",", ".")));
            p.setCategoria(textCategoria.getText());
            p.setQtde(Integer.parseInt(textQtde.getText()));
            p.setImagem(textImg.getText());
            p.setAltura(textAltura.getText());
            p.setLargura(textLargura.getText());
            p.setPeso(textPeso.getText());
            p.setComprimento(textComprimento.getText());

            Produto_DAO.inserir(p);
            JOptionPane.showMessageDialog(null, "Produto cadastrado.");
            limparCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    private void altButtonActionPerformed(ActionEvent evt) {
        try {
            Produto p = new Produto();
            p.setIdProduto(Integer.parseInt(textIDP.getText()));
            p.setNomeProduto(textNome.getText());
            p.setPreco(Double.parseDouble(textPreco.getText().replace(",", ".")));
            p.setCategoria(textCategoria.getText());
            p.setQtde(Integer.parseInt(textQtde.getText()));
            p.setImagem(textImg.getText());
            p.setAltura(textAltura.getText());
            p.setLargura(textLargura.getText());
            p.setPeso(textPeso.getText());
            p.setComprimento(textComprimento.getText());

            Produto_DAO.atualizar(p);
            JOptionPane.showMessageDialog(null, "Produto atualizado.");
            limparCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    private void delButtonActionPerformed(ActionEvent evt) {
        try {
            if (textIDP.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe o ID.");
                return;
            }
            int id = Integer.parseInt(textIDP.getText());
            if (JOptionPane.showConfirmDialog(null, "Excluir produto ID " + id + "?") == JOptionPane.YES_OPTION) {
                Produto p = new Produto();
                p.setIdProduto(id);
                Produto_DAO.deletar(p);
                JOptionPane.showMessageDialog(null, "Produto excluído.");
                limparCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    private void readButtonActionPerformed(ActionEvent evt) {
        try {
            if (textIDP.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe o ID.");
                return;
            }
            Produto p = new Produto();
            p.setIdProduto(Integer.parseInt(textIDP.getText()));
            p = Produto_DAO.buscarPorId(p);

            if (p != null) {
                textNome.setText(p.getNomeProduto());
                textCategoria.setText(p.getCategoria());
                textPreco.setText(String.valueOf(p.getPreco()));
                textQtde.setText(String.valueOf(p.getQtde()));
                textImg.setText(p.getImagem());
                textPeso.setText(p.getPeso());
                textAltura.setText(p.getAltura());
                textLargura.setText(p.getLargura());
                textComprimento.setText(p.getComprimento());
            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado.");
                limparCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    private void returnButtonActionPerformed(ActionEvent evt) {
        new MenuPrincipal().setVisible(true);
        dispose();
    }

    private void limparCampos() {
        textNome.setText("");
        textPreco.setText("");
        textCategoria.setText("");
        textQtde.setText("");
        textImg.setText("");
        textPeso.setText("");
        textAltura.setText("");
        textLargura.setText("");
        textComprimento.setText("");
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(() -> new Estoque_View().setVisible(true));
    }
}