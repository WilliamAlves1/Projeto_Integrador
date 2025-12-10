package visualizar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class MenuPrincipal extends JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuPrincipal.class.getName());

    private final Color COLOR_BG = new Color(243, 246, 249);
    private final Color COLOR_TITLE = new Color(33, 37, 41);

    private final Color BTN_CLIENTE = new Color(52, 152, 219);
    private final Color BTN_ESTOQUE = new Color(46, 204, 113);
    private final Color BTN_FUNC = new Color(243, 156, 18);
    private final Color BTN_EXIT = new Color(231, 76, 60);

    private final Font FONT_TITLE = new Font("Segoe UI", Font.BOLD, 36);
    private final Font FONT_BTN_TITLE = new Font("Segoe UI", Font.BOLD, 20);
    private final Font FONT_BTN_DESC = new Font("Segoe UI", Font.PLAIN, 13);

    private JButton btnCliente, btnEstoque, btnFuncionario, btnSair;

    public MenuPrincipal() {
        initComponents();
        setTitle("Sistema DahoDB - Dashboard");
        setSize(1600, 1000);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(COLOR_BG);

        JPanel contentPanel = new JPanel(new GridBagLayout());
        contentPanel.setBackground(COLOR_BG);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 50, 20);
        gbc.gridx = 0;
        gbc.gridy = 0;

        JLabel lblTitle = new JLabel("Bem-vindo ao Sistema DahoDB");
        lblTitle.setFont(FONT_TITLE);
        lblTitle.setForeground(COLOR_TITLE);
        contentPanel.add(lblTitle, gbc);

        JPanel menuGrid = new JPanel(new GridLayout(1, 3, 40, 0));
        menuGrid.setBackground(COLOR_BG);
        menuGrid.setBorder(new EmptyBorder(20, 20, 20, 20));

        btnCliente = createSolidMenuCard("Clientes", "Gerenciar base de clientes", BTN_CLIENTE);
        btnEstoque = createSolidMenuCard("Estoque", "Controle de produtos", BTN_ESTOQUE);
        btnFuncionario = createSolidMenuCard("Funcionários", "Administração de RH", BTN_FUNC);

        menuGrid.add(btnCliente);
        menuGrid.add(btnEstoque);
        menuGrid.add(btnFuncionario);

        gbc.gridy++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        contentPanel.add(menuGrid, gbc);

        JPanel footerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        footerPanel.setBackground(COLOR_BG);

        btnSair = new JButton("Sair do Sistema");
        btnSair.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnSair.setForeground(Color.WHITE);
        btnSair.setBackground(BTN_EXIT);
        btnSair.setFocusPainted(false);
        btnSair.setBorder(new EmptyBorder(12, 40, 12, 40));
        btnSair.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnSair.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { btnSair.setBackground(BTN_EXIT.darker()); }
            public void mouseExited(MouseEvent evt) { btnSair.setBackground(BTN_EXIT); }
        });

        footerPanel.add(btnSair);

        gbc.gridy++;
        gbc.insets = new Insets(60, 20, 20, 20);
        contentPanel.add(footerPanel, gbc);

        mainPanel.add(contentPanel);
        setContentPane(mainPanel);

        btnCliente.addActionListener(this::clienteButtonActionPerformed);
        btnEstoque.addActionListener(this::estoqueButtonActionPerformed);
        btnFuncionario.addActionListener(this::funcionarioButtonActionPerformed);
        btnSair.addActionListener(e -> System.exit(0));
    }

    private JButton createSolidMenuCard(String title, String desc, Color bgColor) {
        JButton btn = new JButton();
        btn.setLayout(new GridBagLayout());
        btn.setPreferredSize(new Dimension(280, 180));
        btn.setBackground(bgColor);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setFocusPainted(false);

        btn.setBorder(new LineBorder(new Color(0,0,0,30), 1));

        JPanel textPanel = new JPanel(new GridLayout(2, 1, 0, 8));
        textPanel.setBackground(bgColor);
        textPanel.setOpaque(false);

        JLabel lblTitle = new JLabel(title);
        lblTitle.setFont(FONT_BTN_TITLE);
        lblTitle.setForeground(Color.BLACK);
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblDesc = new JLabel(desc);
        lblDesc.setFont(FONT_BTN_DESC);
        lblDesc.setForeground(new Color(30, 30, 30));
        lblDesc.setHorizontalAlignment(SwingConstants.CENTER);

        textPanel.add(lblTitle);
        textPanel.add(lblDesc);

        btn.add(textPanel);

        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                btn.setBackground(bgColor.brighter());
            }
            public void mouseExited(MouseEvent evt) {
                btn.setBackground(bgColor);
            }
        });

        return btn;
    }

    private void funcionarioButtonActionPerformed(ActionEvent evt) {
        new Funcionario_View().setVisible(true);
        dispose();
    }

    private void clienteButtonActionPerformed(ActionEvent evt) {
        new Cliente_View().setVisible(true);
        dispose();
    }

    private void estoqueButtonActionPerformed(ActionEvent evt) {
        new Estoque_View().setVisible(true);
        dispose();
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

        EventQueue.invokeLater(() -> new MenuPrincipal().setVisible(true));
    }
}