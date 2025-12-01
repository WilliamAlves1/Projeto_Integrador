/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visualizar;

import DAO.Cliente_DAO;
import javax.swing.JOptionPane;
import modelos.Cliente;

/**
 *
 * @author tabaxco
 */
public class Cliente_View extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Cliente_View.class.getName());

    public Cliente_View() {
        initComponents();
        setTitle("Gerenciamento de Clientes");
        setLocationRelativeTo(null); // Centraliza a janela

        // Opcional: Desabilitar edição da data, pois é gerada pelo sistema
        textData.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        // Inicialização dos Componentes
        jLabel4 = new javax.swing.JLabel("ID do Cliente:");
        textIDC = new javax.swing.JTextField();
        readButton = new javax.swing.JButton("Buscar");

        jLabel1 = new javax.swing.JLabel("Nome Completo:");
        textNome = new javax.swing.JTextField();

        jLabel2 = new javax.swing.JLabel("E-mail:");
        textEmail = new javax.swing.JTextField();

        jLabel3 = new javax.swing.JLabel("Telefone:");
        textTelefone = new javax.swing.JTextField();

        jLabel5 = new javax.swing.JLabel("Data Cadastro:");
        textData = new javax.swing.JTextField();

        // Botões
        addButton = new javax.swing.JButton("Adicionar");
        altButton = new javax.swing.JButton("Alterar");
        delButton = new javax.swing.JButton("Deletar");
        returnButton = new javax.swing.JButton("Sair");

        // Listeners
        addButton.addActionListener(this::addButtonActionPerformed);
        altButton.addActionListener(this::altButtonActionPerformed);
        delButton.addActionListener(this::delButtonActionPerformed);
        readButton.addActionListener(this::readButtonActionPerformed);
        returnButton.addActionListener(this::returnButtonActionPerformed);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        // --- Configuração do Layout GroupLayout Organizado ---
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);

        // Espaçamento automático
        jPanel1Layout.setAutoCreateGaps(true);
        jPanel1Layout.setAutoCreateContainerGaps(true);

        // GRUPO HORIZONTAL (Colunas)
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        // Linha de Busca (ID)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4) // Label ID
                                .addComponent(textIDC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(readButton))

                        // Linha Nome (ocupa largura total relativa)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textNome))

                        // Linha E-mail e Telefone (dividindo a linha)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20) // Espaço extra
                                .addComponent(jLabel3)
                                .addComponent(textTelefone))

                        // Linha Data (Visual apenas)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))

                        // Linha Botões (Centralizados)
                        .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel1Layout.createSequentialGroup()
                                .addGap(20)
                                .addComponent(addButton)
                                .addComponent(altButton)
                                .addComponent(delButton)
                                .addComponent(returnButton)
                                .addGap(20))
        );

        // GRUPO VERTICAL (Linhas)
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createSequentialGroup()

                        // Linha ID/Busca
                        .addGap(10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(textIDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(readButton))
                        .addGap(20)

                        // Linha Nome
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                        // Linha Email e Telefone
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                        // Linha Data
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                        .addGap(40) // Espaço antes dos botões

                        // Linha Botões
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addButton)
                                .addComponent(altButton)
                                .addComponent(delButton)
                                .addComponent(returnButton))
                        .addGap(20)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if(textIDC.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Digite o ID para excluir.");
                return;
            }

            int IDcliente = Integer.parseInt(textIDC.getText());
            Cliente delCliente = new Cliente();
            delCliente.setID_Cliente(IDcliente);

            // Confirmação de segurança
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
                // Verifica se a data não é nula antes de converter
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
        String nome = textNome.getText();
        java.sql.Date hoje = new java.sql.Date(System.currentTimeMillis());
        String email = textEmail.getText();
        String telefone = textTelefone.getText();

        Cliente novoCliente = new Cliente();
        novoCliente.setNome(nome);
        novoCliente.setDataCadastro(hoje);
        novoCliente.setEmail(email);
        novoCliente.setTelefone(telefone);

        try {
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage());
        }
    }

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // new MenuPrincipal().setVisible(true); // Descomente se tiver menu
        dispose();
    }

    // Método para limpar a tela após ações
    private void limparCampos() {
        textNome.setText("");
        textEmail.setText("");
        textTelefone.setText("");
        textData.setText("");
        // textIDC.setText(""); // Opcional limpar o ID
    }

    /**
     * @param args the command line arguments
     */
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Cliente_View().setVisible(true));
    }

    // Variables declaration - do not modify
    private javax.swing.JButton addButton;
    private javax.swing.JButton altButton;
    private javax.swing.JButton delButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton readButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JTextField textData;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textIDC;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration
}