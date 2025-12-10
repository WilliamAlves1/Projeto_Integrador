package visualizar;

import DAO.Funcionario_DAO;
import modelos.Funcionario;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Cadastro_View extends JFrame {

    private final Color COLOR_BG = new Color(243, 246, 249);
    private final Color COLOR_CARD = Color.WHITE;
    private final Color COLOR_TITLE = new Color(33, 37, 41);
    private final Color COLOR_LABEL = new Color(73, 80, 87);
    private final Color COLOR_BORDER = new Color(206, 212, 218);
    private final Color BTN_PRIMARY = new Color(13, 110, 253);
    private final Color BTN_SECONDARY = new Color(108, 117, 125);

    private final Font FONT_TITLE = new Font("Segoe UI", Font.BOLD, 28);
    private final Font FONT_LABEL = new Font("Segoe UI", Font.BOLD, 14);
    private final Font FONT_INPUT = new Font("Segoe UI", Font.PLAIN, 16);

    private JTextField textUser, textEmail;
    private JPasswordField textSenha, textConfirmaSenha;
    private JButton btnCadastrar, btnVoltar;

    public Cadastro_View() {
        initComponents();
        setTitle("Sistema DahoDB - Novo Cadastro");
        setSize(1700, 1000);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(COLOR_BG);

        JPanel cardPanel = new JPanel(new GridBagLayout());
        cardPanel.setBackground(COLOR_CARD);
        cardPanel.setBorder(new CompoundBorder(
                new LineBorder(new Color(0, 0, 0, 20), 1),
                new EmptyBorder(40, 50, 40, 50)
        ));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblTitle = new JLabel("Criar Nova Conta");
        lblTitle.setFont(FONT_TITLE);
        lblTitle.setForeground(COLOR_TITLE);
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.insets = new Insets(0, 0, 30, 0);
        cardPanel.add(lblTitle, gbc);

        gbc.gridy++;
        gbc.insets = new Insets(5, 0, 5, 0);
        cardPanel.add(createLabel("Nome de Usuário"), gbc);

        gbc.gridy++;
        textUser = createTextField();
        cardPanel.add(textUser, gbc);

        gbc.gridy++;
        cardPanel.add(createLabel("E-mail"), gbc);

        gbc.gridy++;
        textEmail = createTextField();
        cardPanel.add(textEmail, gbc);

        gbc.gridy++;
        cardPanel.add(createLabel("Senha"), gbc);

        gbc.gridy++;
        textSenha = createPasswordField();
        cardPanel.add(textSenha, gbc);

        gbc.gridy++;
        cardPanel.add(createLabel("Confirmar Senha"), gbc);

        gbc.gridy++;
        textConfirmaSenha = createPasswordField();
        cardPanel.add(textConfirmaSenha, gbc);

        gbc.gridy++;
        gbc.insets = new Insets(30, 0, 10, 0);
        btnCadastrar = createButton("Finalizar Cadastro", BTN_PRIMARY);
        cardPanel.add(btnCadastrar, gbc);

        gbc.gridy++;
        gbc.insets = new Insets(0, 0, 0, 0);
        btnVoltar = createButton("Voltar ao Login", BTN_SECONDARY);
        cardPanel.add(btnVoltar, gbc);

        mainPanel.add(cardPanel);
        setContentPane(mainPanel);

        btnCadastrar.addActionListener(this::cadastrarAction);
        btnVoltar.addActionListener(e -> {
            new Login_View().setVisible(true);
            dispose();
        });
    }

    private void cadastrarAction(ActionEvent e) {
        String usuario = textUser.getText();
        String email = textEmail.getText();
        String senha = new String(textSenha.getPassword());
        String confSenha = new String(textConfirmaSenha.getPassword());

        if(usuario.isEmpty() || senha.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            return;
        }

        if(!senha.equals(confSenha)) {
            JOptionPane.showMessageDialog(null, "As senhas não coincidem!");
            return;
        }

        try {
            Funcionario novoFunc = new Funcionario();
            novoFunc.setUsuario(usuario);
            novoFunc.setSenha(senha);
            novoFunc.setEmail(email);
            novoFunc.setNome(usuario);
            novoFunc.setCargo("Novo Usuário");
            novoFunc.setDepartamento("Geral");
            novoFunc.setDataCadastro(new java.sql.Date(System.currentTimeMillis()));

            Funcionario_DAO.inserir(novoFunc);

            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            new Login_View().setVisible(true);
            dispose();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + ex.getMessage());
        }
    }

    private JLabel createLabel(String text) {
        JLabel lbl = new JLabel(text);
        lbl.setFont(FONT_LABEL);
        lbl.setForeground(COLOR_LABEL);
        return lbl;
    }

    private JTextField createTextField() {
        JTextField txt = new JTextField(25);
        txt.setFont(FONT_INPUT);
        txt.setForeground(Color.BLACK);
        txt.setBackground(Color.WHITE);
        txt.setBorder(new CompoundBorder(new LineBorder(COLOR_BORDER), new EmptyBorder(10, 12, 10, 12)));
        return txt;
    }

    private JPasswordField createPasswordField() {
        JPasswordField txt = new JPasswordField(25);
        txt.setFont(FONT_INPUT);
        txt.setForeground(Color.BLACK);
        txt.setBackground(Color.WHITE);
        txt.setBorder(new CompoundBorder(new LineBorder(COLOR_BORDER), new EmptyBorder(10, 12, 10, 12)));
        return txt;
    }

    private JButton createButton(String text, Color bg) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btn.setForeground(Color.WHITE);
        btn.setBackground(bg);
        btn.setFocusPainted(false);
        btn.setBorder(new EmptyBorder(12, 0, 12, 0));
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
}