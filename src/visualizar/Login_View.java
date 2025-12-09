package visualizar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Login_View extends JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login_View.class.getName());

    private final Color COLOR_BG = new Color(243, 246, 249);
    private final Color COLOR_CARD = Color.WHITE;
    private final Color COLOR_TITLE = new Color(33, 37, 41);
    private final Color COLOR_LABEL = new Color(73, 80, 87);
    private final Color COLOR_BORDER = new Color(206, 212, 218);
    private final Color BTN_PRIMARY = new Color(13, 110, 253);

    private final Font FONT_TITLE = new Font("Segoe UI", Font.BOLD, 28);
    private final Font FONT_LABEL = new Font("Segoe UI", Font.BOLD, 14);
    private final Font FONT_INPUT = new Font("Segoe UI", Font.PLAIN, 16);

    private JTextField textUser;
    private JPasswordField textSenha;
    private JButton btnLogin;

    public Login_View() {
        initComponents();
        setTitle("Sistema DahoDB - Login");
        setSize(1700, 1000);
        setLocationRelativeTo(null);
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

        JLabel lblTitle = new JLabel("Bem-vindo ao DahoDB");
        lblTitle.setFont(FONT_TITLE);
        lblTitle.setForeground(COLOR_TITLE);
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.insets = new Insets(0, 0, 30, 0);
        cardPanel.add(lblTitle, gbc);

        gbc.gridy++;
        gbc.insets = new Insets(5, 0, 5, 0);
        cardPanel.add(createLabel("Usuário"), gbc);

        gbc.gridy++;
        textUser = createTextField();
        cardPanel.add(textUser, gbc);

        gbc.gridy++;
        gbc.insets = new Insets(15, 0, 5, 0);
        cardPanel.add(createLabel("Senha"), gbc);

        gbc.gridy++;
        gbc.insets = new Insets(5, 0, 5, 0);
        textSenha = createPasswordField();
        cardPanel.add(textSenha, gbc);

        gbc.gridy++;
        gbc.insets = new Insets(30, 0, 0, 0);
        btnLogin = createButton("Entrar no Sistema");
        cardPanel.add(btnLogin, gbc);

        mainPanel.add(cardPanel);
        setContentPane(mainPanel);

        btnLogin.addActionListener(this::loginButtonActionPerformed);

        getRootPane().setDefaultButton(btnLogin);
    }

    private JLabel createLabel(String text) {
        JLabel lbl = new JLabel(text);
        lbl.setFont(FONT_LABEL);
        lbl.setForeground(COLOR_LABEL);
        return lbl;
    }

    private JTextField createTextField() {
        JTextField txt = new JTextField(20);
        txt.setFont(FONT_INPUT);
        txt.setForeground(Color.BLACK);
        txt.setBackground(Color.WHITE);
        txt.setBorder(new CompoundBorder(
                new LineBorder(COLOR_BORDER),
                new EmptyBorder(10, 12, 10, 12)
        ));
        return txt;
    }

    private JPasswordField createPasswordField() {
        JPasswordField txt = new JPasswordField(20);
        txt.setFont(FONT_INPUT);
        txt.setForeground(Color.BLACK);
        txt.setBackground(Color.WHITE);
        txt.setBorder(new CompoundBorder(
                new LineBorder(COLOR_BORDER),
                new EmptyBorder(10, 12, 10, 12)
        ));
        return txt;
    }

    private JButton createButton(String text) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 16));
        btn.setForeground(Color.WHITE);
        btn.setBackground(BTN_PRIMARY);
        btn.setFocusPainted(false);
        btn.setBorder(new EmptyBorder(12, 0, 12, 0));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                btn.setBackground(BTN_PRIMARY.darker());
            }
            public void mouseExited(MouseEvent evt) {
                btn.setBackground(BTN_PRIMARY);
            }
        });
        return btn;
    }

    private void loginButtonActionPerformed(ActionEvent evt) {
        String usuario = textUser.getText();
        String senha = new String(textSenha.getPassword());

        if (usuario.equals("jonas") && senha.equals("123")) {
            JOptionPane.showMessageDialog(null, "Bem vindo de volta!");
            new MenuPrincipal().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.");
        }
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
        EventQueue.invokeLater(() -> new Login_View().setVisible(true));
    }
}