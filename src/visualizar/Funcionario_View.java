package visualizar;

import javax.swing.JOptionPane;
import modelos.Funcionario;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Funcionario_View extends JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Funcionario_View.class.getName());

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

    private JButton addButton, altButton, delButton, readButton, returnButton;
    private JTextField textIDF, textNome, textTelefone, textEmail, textFunc, textDepartamento, textSalario, textData, textUser, textSenha;

    public Funcionario_View() {
        initComponents();
        setTitle("Sistema DahoDB - Gerenciamento de Funcionários");
        setSize(1700, 1000);
        textData.setEditable(false);
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
        gbc.insets = new Insets(10, 15, 10, 15);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTHWEST;

        JLabel lblTitle = new JLabel("Gerenciamento de Funcionários");
        lblTitle.setFont(FONT_TITLE);
        lblTitle.setForeground(COLOR_TITLE);

        JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headerPanel.setBackground(COLOR_CARD);
        headerPanel.add(lblTitle);
        headerPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(240, 240, 240)));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.weightx = 1.0;
        gbc.insets = new Insets(0, 0, 40, 0);
        cardPanel.add(headerPanel, gbc);

        gbc.insets = new Insets(10, 15, 10, 15);

        gbc.gridwidth = 1;
        gbc.gridy++;
        gbc.gridx = 0;
        gbc.weightx = 0.0;
        cardPanel.add(createLabel("ID Funcionário:"), gbc);

        textIDF = createTextField();
        gbc.gridx = 1;
        gbc.weightx = 0.3;
        cardPanel.add(textIDF, gbc);

        readButton = createButton("Buscar", BTN_PRIMARY, Color.WHITE);
        gbc.gridx = 2;
        gbc.weightx = 0.0;
        cardPanel.add(readButton, gbc);

        gbc.gridx = 3;
        gbc.weightx = 1.0;
        cardPanel.add(new JLabel(""), gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        gbc.weightx = 0.0;
        cardPanel.add(createLabel("Nome Completo:"), gbc);

        textNome = createTextField();
        gbc.gridx = 1;
        gbc.gridwidth = 3;
        gbc.weightx = 1.0;
        cardPanel.add(textNome, gbc);

        gbc.gridwidth = 1;
        gbc.gridy++;
        gbc.gridx = 0;
        gbc.weightx = 0.0;
        cardPanel.add(createLabel("E-mail:"), gbc);

        textEmail = createTextField();
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        cardPanel.add(textEmail, gbc);

        gbc.gridx = 2;
        gbc.weightx = 0.0;
        cardPanel.add(createLabel("Telefone:"), gbc);

        textTelefone = createTextField();
        gbc.gridx = 3;
        gbc.weightx = 1.0;
        cardPanel.add(textTelefone, gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        gbc.weightx = 0.0;
        cardPanel.add(createLabel("Função/Cargo:"), gbc);

        textFunc = createTextField();
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        cardPanel.add(textFunc, gbc);

        gbc.gridx = 2;
        gbc.weightx = 0.0;
        cardPanel.add(createLabel("Departamento:"), gbc);

        textDepartamento = createTextField();
        gbc.gridx = 3;
        gbc.weightx = 1.0;
        cardPanel.add(textDepartamento, gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        gbc.weightx = 0.0;
        cardPanel.add(createLabel("Salário (R$):"), gbc);

        textSalario = createTextField();
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        cardPanel.add(textSalario, gbc);

        gbc.gridx = 2;
        gbc.weightx = 0.0;
        cardPanel.add(createLabel("Data Contratação:"), gbc);

        textData = createTextField();
        textData.setBackground(new Color(245, 245, 245));
        gbc.gridx = 3;
        gbc.weightx = 1.0;
        cardPanel.add(textData, gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        gbc.weightx = 0.0;
        cardPanel.add(createLabel("Usuário (Login):"), gbc);

        textUser = createTextField();
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        cardPanel.add(textUser, gbc);

        gbc.gridx = 2;
        gbc.weightx = 0.0;
        cardPanel.add(createLabel("Senha:"), gbc);

        textSenha = createTextField();
        gbc.gridx = 3;
        gbc.weightx = 1.0;
        cardPanel.add(textSenha, gbc);

        JPanel bottomSpacer = new JPanel();
        bottomSpacer.setBackground(COLOR_CARD);
        gbc.gridy++;
        gbc.weighty = 1.0;
        cardPanel.add(bottomSpacer, gbc);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 0));
        buttonPanel.setBackground(COLOR_CARD);
        buttonPanel.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, new Color(240, 240, 240)));

        JPanel paddingPanel = new JPanel();
        paddingPanel.setBackground(COLOR_CARD);
        paddingPanel.setBorder(new EmptyBorder(20, 0, 0, 0));
        paddingPanel.add(buttonPanel);

        addButton = createButton("Adicionar", BTN_SUCCESS, Color.WHITE);
        altButton = createButton("Salvar Edição", BTN_WARNING, new Color(33, 37, 41));
        delButton = createButton("Deletar", BTN_DANGER, Color.WHITE);
        returnButton = createButton("Voltar", BTN_SECONDARY, Color.WHITE);

        buttonPanel.add(returnButton);
        buttonPanel.add(delButton);
        buttonPanel.add(altButton);
        buttonPanel.add(addButton);

        gbc.gridy++;
        gbc.weighty = 0.0;
        gbc.insets = new Insets(20, 15, 10, 15);
        cardPanel.add(paddingPanel, gbc);

        mainPanel.add(cardPanel, mainGbc);
        setContentPane(mainPanel);

        addButton.addActionListener(this::addButtonActionPerformed);
        altButton.addActionListener(this::altButtonActionPerformed);
        delButton.addActionListener(this::delButtonActionPerformed);
        readButton.addActionListener(this::readButtonActionPerformed);
        returnButton.addActionListener(this::returnButtonActionPerformed);
    }

    private JLabel createLabel(String text) {
        JLabel lbl = new JLabel(text);
        lbl.setFont(FONT_LABEL);
        lbl.setForeground(COLOR_LABEL);
        return lbl;
    }

    private JTextField createTextField() {
        JTextField txt = new JTextField(15);
        txt.setFont(FONT_INPUT);
        txt.setForeground(Color.BLACK);
        txt.setBackground(Color.WHITE);
        txt.setBorder(new CompoundBorder(new LineBorder(COLOR_BORDER), new EmptyBorder(8, 10, 8, 10)));
        return txt;
    }

    private JButton createButton(String text, Color bg, Color fg) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btn.setForeground(fg);
        btn.setBackground(bg);
        btn.setFocusPainted(false);
        btn.setBorder(new EmptyBorder(12, 25, 12, 25));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                btn.setBackground(bg.darker());
            }
            public void mouseExited(MouseEvent evt) {
                btn.setBackground(bg);
            }
        });
        return btn;
    }

    private void altButtonActionPerformed(ActionEvent evt) {
        try {
            int id = Integer.parseInt(textIDF.getText());
            String nome = textNome.getText();
            String telefone = textTelefone.getText();
            String cargo = textFunc.getText();
            double salario = Double.parseDouble(textSalario.getText().replace(",", "."));
            String departamento = textDepartamento.getText();
            String email = textEmail.getText();
            String usuario = textUser.getText();
            String senha = textSenha.getText();

            Funcionario altFuncionario = new Funcionario();
            altFuncionario.setID_Funcionario(id);
            altFuncionario.setNome(nome);
            altFuncionario.setCargo(cargo);
            altFuncionario.setTelefone(telefone);
            altFuncionario.setSalario(salario);
            altFuncionario.setDepartamento(departamento);
            altFuncionario.setEmail(email);
            altFuncionario.setUsuario(usuario);
            altFuncionario.setSenha(senha);

            DAO.Funcionario_DAO.atualizar(altFuncionario);
            JOptionPane.showMessageDialog(null, "Funcionário atualizado corretamente.");
            limparCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar funcionário: " + e.getMessage());
        }
    }

    private void delButtonActionPerformed(ActionEvent evt) {
        try {
            if (textIDF.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite o ID para excluir.");
                return;
            }

            int id = Integer.parseInt(textIDF.getText());
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja demitir/excluir o funcionário ID " + id + "?");
            if (confirm == JOptionPane.YES_OPTION) {
                Funcionario delFuncionario = new Funcionario();
                delFuncionario.setID_Funcionario(id);
                DAO.Funcionario_DAO.deletar(delFuncionario);
                JOptionPane.showMessageDialog(null, "Funcionário deletado corretamente.");
                limparCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar funcionário: " + e.getMessage());
        }
    }

    private void readButtonActionPerformed(ActionEvent evt) {
        try {
            if (textIDF.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite um ID para buscar.");
                return;
            }

            int id = Integer.parseInt(textIDF.getText());
            Funcionario readFuncionario = new Funcionario();
            readFuncionario.setID_Funcionario(id);

            readFuncionario = DAO.Funcionario_DAO.buscarPorId(readFuncionario);

            if (readFuncionario != null) {
                textNome.setText(readFuncionario.getNome());
                textFunc.setText(readFuncionario.getCargo());
                textSalario.setText(Double.toString(readFuncionario.getSalario()));
                textEmail.setText(readFuncionario.getEmail());
                textTelefone.setText(readFuncionario.getTelefone());

                if (readFuncionario.getDepartamento() == null) {
                    textDepartamento.setText("Beta Tester");
                } else {
                    textDepartamento.setText(readFuncionario.getDepartamento());
                }

                textUser.setText(readFuncionario.getUsuario());
                textSenha.setText(readFuncionario.getSenha());

                if (readFuncionario.getDataCadastro() != null) {
                    textData.setText(readFuncionario.getDataCadastro().toString());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado.");
                limparCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar funcionário: " + e.getMessage());
        }
    }

    private void addButtonActionPerformed(ActionEvent evt) {
        try {
            String nome = textNome.getText();
            String telefone = textTelefone.getText();
            String cargo = textFunc.getText();
            double salario = Double.parseDouble(textSalario.getText().replace(",", "."));
            String departamento = textDepartamento.getText();
            String email = textEmail.getText();
            String usuario = textUser.getText();
            String senha = textSenha.getText();
            java.sql.Date hoje = new java.sql.Date(System.currentTimeMillis());

            Funcionario addFuncionario = new Funcionario();
            addFuncionario.setNome(nome);
            addFuncionario.setCargo(cargo);
            addFuncionario.setTelefone(telefone);
            addFuncionario.setSalario(salario);
            addFuncionario.setDepartamento(departamento);
            addFuncionario.setEmail(email);
            addFuncionario.setUsuario(usuario);
            addFuncionario.setSenha(senha);
            addFuncionario.setDataCadastro(hoje);

            DAO.Funcionario_DAO.inserir(addFuncionario);
            JOptionPane.showMessageDialog(null, "Funcionário inserido corretamente.");
            limparCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir: " + e.getMessage());
        }
    }

    private void returnButtonActionPerformed(ActionEvent evt) {
        new MenuPrincipal().setVisible(true);
        dispose();
    }

    private void limparCampos() {
        textNome.setText("");
        textTelefone.setText("");
        textFunc.setText("");
        textSalario.setText("");
        textDepartamento.setText("");
        textEmail.setText("");
        textUser.setText("");
        textSenha.setText("");
        textData.setText("");
    }

    public static void main(String args[]) {
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

        EventQueue.invokeLater(() -> new Funcionario_View().setVisible(true));
    }
}