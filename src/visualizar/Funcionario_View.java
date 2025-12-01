/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visualizar;

import javax.swing.JOptionPane;
import modelos.Funcionario;
import java.awt.Color;

/**
 *
 * @author tabaxco
 */
public class Funcionario_View extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Funcionario_View.class.getName());

    public Funcionario_View() {
        initComponents();
        setTitle("Gerenciamento de Funcionários");
        setLocationRelativeTo(null); // Centraliza na tela

        // Desabilita edição da data (gerada pelo sistema)
        textData.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        // --- Inicialização dos Componentes ---

        // Busca
        jLabel4 = new javax.swing.JLabel("ID Funcionário:");
        textIDF = new javax.swing.JTextField();
        readButton = new javax.swing.JButton("Buscar");

        // Dados Pessoais
        jLabel1 = new javax.swing.JLabel("Nome Completo:");
        textNome = new javax.swing.JTextField();

        jLabel2 = new javax.swing.JLabel("Telefone:");
        textTelefone = new javax.swing.JTextField();

        jLabel3 = new javax.swing.JLabel("E-mail:");
        textEmail = new javax.swing.JTextField();

        // Dados Profissionais
        // Nota: textFuncao era Label no original, alterei nome da variavel para evitar confusão com textFunc (campo)
        javax.swing.JLabel lblCargo = new javax.swing.JLabel("Função/Cargo:");
        textFunc = new javax.swing.JTextField(); // Campo do Cargo

        jLabel6 = new javax.swing.JLabel("Departamento:");
        textDepartamento = new javax.swing.JTextField();

        jLabel5 = new javax.swing.JLabel("Salário (R$):");
        textSalario = new javax.swing.JTextField();

        jLabel8 = new javax.swing.JLabel("Data Contratação:");
        textData = new javax.swing.JTextField();

        // Dados de Acesso
        jLabel7 = new javax.swing.JLabel("Usuário (Login):");
        textUser = new javax.swing.JTextField();

        jLabel9 = new javax.swing.JLabel("Senha:");
        textSenha = new javax.swing.JTextField(); // Idealmente seria JPasswordField

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

        // --- Configuração do Layout GroupLayout ---
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);

        // Cria margens automáticas
        jPanel1Layout.setAutoCreateGaps(true);
        jPanel1Layout.setAutoCreateContainerGaps(true);

        // GRUPO HORIZONTAL
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        // Linha 1: Busca (ID)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addComponent(textIDF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(readButton))

                        // Linha 2: Nome
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textNome))

                        // Linha 3: Telefone e Email
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20)
                                .addComponent(jLabel3)
                                .addComponent(textEmail))

                        // Linha 4: Cargo e Departamento
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20)
                                .addComponent(jLabel6)
                                .addComponent(textDepartamento))

                        // Linha 5: Salário e Data
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20)
                                .addComponent(jLabel8)
                                .addComponent(textData))

                        // Linha 6: Usuário e Senha
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20)
                                .addComponent(jLabel9)
                                .addComponent(textSenha))

                        // Linha 7: Botões
                        .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel1Layout.createSequentialGroup()
                                .addGap(20)
                                .addComponent(addButton)
                                .addComponent(altButton)
                                .addComponent(delButton)
                                .addComponent(returnButton)
                                .addGap(20))
        );

        // GRUPO VERTICAL
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createSequentialGroup()
                        // Busca
                        .addGap(10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(textIDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(readButton))
                        .addGap(20)

                        // Nome
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                        // Telefone/Email
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                        // Cargo/Depto
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCargo)
                                .addComponent(textFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(textDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                        // Salario/Data
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(textSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                        // User/Senha
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                        .addGap(30)

                        // Botões
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

    private void altButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int id = Integer.parseInt(textIDF.getText());
            String nome = textNome.getText();
            String telefone = textTelefone.getText();
            String cargo = textFunc.getText();
            double salario = Double.parseDouble(textSalario.getText().replace(",", ".")); // Garante formato numérico
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar funcionário: " + e.getMessage());
        }
    }

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if(textIDF.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite o ID para excluir.");
                return;
            }

            int id = Integer.parseInt(textIDF.getText());

            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja demitir/excluir o funcionário ID " + id + "?");
            if(confirm == JOptionPane.YES_OPTION) {
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

    private void readButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if(textIDF.getText().isEmpty()) {
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

                // NOTA: Removi o "R$" aqui para não dar erro se você clicar em "Alterar" depois
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

                if(readFuncionario.getDataCadastro() != null){
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

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String nome = textNome.getText();
            String telefone = textTelefone.getText();
            String cargo = textFunc.getText();

            // Tratamento simples para vírgula
            String salStr = textSalario.getText().replace(",", ".");
            double salario = Double.parseDouble(salStr);

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

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // new MenuPrincipal().setVisible(true); // Descomente se tiver menu
        dispose();
    }

    // Método para limpar campos
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
        // textIDF.setText("");
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
        java.awt.EventQueue.invokeLater(() -> new Funcionario_View().setVisible(true));
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton readButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JTextField textData;
    private javax.swing.JTextField textDepartamento;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textFunc;
    private javax.swing.JTextField textIDF;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textSalario;
    private javax.swing.JTextField textSenha;
    private javax.swing.JTextField textTelefone;
    private javax.swing.JTextField textUser;
    // End of variables declaration
}