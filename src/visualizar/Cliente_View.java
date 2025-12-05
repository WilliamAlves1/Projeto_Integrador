package visualizar;

import DAO.Cliente_DAO;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import modelos.Cliente;

public class Cliente_View extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Cliente_View.class.getName());

    private final Color COLOR_BG = new Color(44, 62, 80);
    private final Color COLOR_CARD = new Color(52, 73, 94);
    private final Color COLOR_TEXT = new Color(236, 240, 241);
    private final Color COLOR_PRIMARY = new Color(52, 152, 219);
    private final Color COLOR_SUCCESS = new Color(46, 204, 113);
    private final Color COLOR_DANGER = new Color(231, 76, 60);
    private final Font FONT_LABEL = new Font("Segoe UI", Font.BOLD, 14);
    private final Font FONT_INPUT = new Font("Segoe UI", Font.PLAIN, 14);

    public Cliente_View() {
        initComponents();
        setTitle("Gerenciamento de Clientes");
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        textData.setEditable(false);
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(COLOR_BG);

        JPanel cardPanel = new JPanel(new GridBagLayout());
        cardPanel.setBackground(COLOR_CARD);
        cardPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(60, 80, 100), 1),
                new EmptyBorder(30, 40, 30, 40)
        ));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblTitle = new JLabel("Gerenciamento de Clientes");
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 24));
        lblTitle.setForeground(COLOR_TEXT);
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 4;
        cardPanel.add(lblTitle, gbc);

        gbc.gridwidth = 1; gbc.gridy++; gbc.gridx = 0;
        cardPanel.add(createLabel("ID do Cliente:"), gbc);

        textIDC = createTextField();
        gbc.gridx = 1;
        cardPanel.add(textIDC, gbc);

        readButton = createButton("Buscar", COLOR_PRIMARY);
        gbc.gridx = 2;
        cardPanel.add(readButton, gbc);

        gbc.gridy++; gbc.gridx = 0;
        cardPanel.add(createLabel("Nome Completo:"), gbc);

        textNome = createTextField();
        gbc.gridx = 1; gbc.gridwidth = 3;
        cardPanel.add(textNome, gbc);

        gbc.gridwidth = 1; gbc.gridy++; gbc.gridx = 0;
        cardPanel.add(createLabel("E-mail:"), gbc);

        textEmail = createTextField();
        gbc.gridx = 1;
        cardPanel.add(textEmail, gbc);

        gbc.gridx = 2;
        cardPanel.add(createLabel("Telefone:"), gbc);

        textTelefone = createTextField();
        gbc.gridx = 3;
        cardPanel.add(textTelefone, gbc);

        gbc.gridy++; gbc.gridx = 0;
        cardPanel.add(createLabel("Data Cadastro:"), gbc);

        textData = createTextField();
        textData.setBackground(new Color(44, 62, 80));
        gbc.gridx = 1;
        cardPanel.add(textData, gbc);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        buttonPanel.setBackground(COLOR_CARD);

        addButton = createButton("Adicionar", COLOR_SUCCESS);
        altButton = createButton("Alterar", new Color(243, 156, 18));
        delButton = createButton("Deletar", COLOR_DANGER);
        returnButton = createButton("Voltar", new Color(149, 165, 166));

        buttonPanel.add(addButton);
        buttonPanel.add(altButton);
        buttonPanel.add(delButton);
        buttonPanel.add(returnButton);

        gbc.gridy++; gbc.gridx = 0; gbc.gridwidth = 4; gbc.insets = new Insets(30, 10, 10, 10);
        cardPanel.add(buttonPanel, gbc);

        mainPanel.add(cardPanel);
        setContentPane(mainPanel);

        addButton.addActionListener(this::addButtonActionPerformed);
        altButton.addActionListener(this::altButtonActionPerformed);
        delButton.addActionListener(this::delButtonActionPerformed);
        readButton.addActionListener(this::readButtonActionPerformed);
        returnButton.addActionListener(this::returnButtonActionPerformed);

        pack();
    }

    private JLabel createLabel(String text) {
        JLabel lbl = new JLabel(text);
        lbl.setFont(FONT_LABEL);
        lbl.setForeground(COLOR_TEXT);
        return lbl;
    }

    private JTextField createTextField() {
        JTextField txt = new JTextField(15);
        txt.setFont(FONT_INPUT);
        txt.setForeground(Color.WHITE);
        txt.setBackground(new Color(65, 85, 105));
        txt.setCaretColor(Color.WHITE);
        txt.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(80, 100, 120)),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        return txt;
    }

    private JButton createButton(String text, Color bg) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 12));
        btn.setForeground(Color.WHITE);
        btn.setBackground(bg);
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn.setBackground(bg.brighter());
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn.setBackground(bg);
            }
        });
        return btn;
    }

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if(textIDC.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Digite o ID para excluir.");
                return;
            }

            int IDcliente = Integer.parseInt(textIDC.getText());
            Cliente delCliente = new Cliente();
            delCliente.setID_Cliente(IDcliente);

            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o cliente ID " + IDcliente + "?");
            if (confirm == JOptionPane.YES_OPTION) {
                Cliente_DAO.deletar(delCliente);
                JOptionPane.showMessageDialog(null, "Cliente excluído corretamente.");
                limparCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + e.getMessage());
        }
    }

    private void readButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if(textIDC.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Digite um ID para buscar.");
                return;
            }

            int IDcliente = Integer.parseInt(textIDC.getText());
            Cliente readCliente = new Cliente();
            readCliente.setID_Cliente(IDcliente);

            readCliente = Cliente_DAO.buscarPorId(readCliente);

            if (readCliente != null) {
                textNome.setText(readCliente.getNome());
                textTelefone.setText(readCliente.getTelefone());
                textEmail.setText(readCliente.getEmail());
                if(readCliente.getDataCadastro() != null) {
                    textData.setText(readCliente.getDataCadastro().toString());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
                limparCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente: " + e.getMessage());
        }
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String nome = textNome.getText();
            java.sql.Date hoje = new java.sql.Date(System.currentTimeMillis());
            String email = textEmail.getText();
            String telefone = textTelefone.getText();

            Cliente novoCliente = new Cliente();
            novoCliente.setNome(nome);
            novoCliente.setDataCadastro(hoje);
            novoCliente.setEmail(email);
            novoCliente.setTelefone(telefone);

            Cliente_DAO.inserir(novoCliente);
            JOptionPane.showMessageDialog(null, "Cliente inserido corretamente.");
            limparCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage());
        }
    }

    private void altButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String nome = textNome.getText();
            int IDcliente = Integer.parseInt(textIDC.getText());
            String email = textEmail.getText();
            String telefone = textTelefone.getText();

            Cliente altCliente = new Cliente();
            altCliente.setID_Cliente(IDcliente);
            altCliente.setNome(nome);
            altCliente.setEmail(email);
            altCliente.setTelefone(telefone);

            Cliente_DAO.atualizar(altCliente);
            JOptionPane.showMessageDialog(null, "Cliente atualizado corretamente.");
            limparCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage());
        }
    }

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new MenuPrincipal().setVisible(true);
        dispose();
    }

    private void limparCampos() {
        textNome.setText("");
        textEmail.setText("");
        textTelefone.setText("");
        textData.setText("");
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new Cliente_View().setVisible(true));
    }

    private javax.swing.JButton addButton;
    private javax.swing.JButton altButton;
    private javax.swing.JButton delButton;
    private javax.swing.JButton readButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JTextField textData;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textIDC;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textTelefone;
}