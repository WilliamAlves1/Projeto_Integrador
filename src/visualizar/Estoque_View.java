/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visualizar;

import DAO.Produto_DAO;
import javax.swing.JOptionPane;
import modelos.Produto;

public class Estoque_View extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Estoque_View.class.getName());

    public Estoque_View() {
        initComponents();
        setTitle("Gerenciamento de Estoque");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        jLabel8 = new javax.swing.JLabel("ID do Produto:");
        textIDP = new javax.swing.JTextField();
        readButton = new javax.swing.JButton("Buscar");

        jLabel1 = new javax.swing.JLabel("Nome:");
        textNome = new javax.swing.JTextField();

        jLabel5 = new javax.swing.JLabel("Preço (R$):");
        textPreco = new javax.swing.JTextField();

        jLabel6 = new javax.swing.JLabel("Categoria:");
        textCategoria = new javax.swing.JTextField();

        jLabel7 = new javax.swing.JLabel("Qtd:");
        textQtde = new javax.swing.JTextField();

        jLabel2 = new javax.swing.JLabel("Imagem (URL):");
        textImg = new javax.swing.JTextField();

        jLabel3 = new javax.swing.JLabel("Peso:");
        textPeso = new javax.swing.JTextField();

        jLabel4 = new javax.swing.JLabel("Comp:");
        textComprimento = new javax.swing.JTextField();

        jLabel9 = new javax.swing.JLabel("Larg:");
        textLargura = new javax.swing.JTextField();

        jLabel10 = new javax.swing.JLabel("Alt:");
        textAltura = new javax.swing.JTextField();

        addButton = new javax.swing.JButton("Adicionar");
        altButton = new javax.swing.JButton("Alterar");
        delButton = new javax.swing.JButton("Deletar");
        returnButton = new javax.swing.JButton("Sair");

        addButton.addActionListener(this::addButtonActionPerformed);
        altButton.addActionListener(this::altButtonActionPerformed);
        delButton.addActionListener(this::delButtonActionPerformed);
        readButton.addActionListener(this::readButtonActionPerformed);
        returnButton.addActionListener(this::returnButtonActionPerformed);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setAutoCreateGaps(true);
        jPanel1Layout.setAutoCreateContainerGaps(true);

        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addComponent(textIDP, 80, 80, 80)
                                .addComponent(readButton))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textNome, 250, 300, 500))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textPreco, 100, 120, 150)
                                .addGap(20)
                                .addComponent(jLabel6)
                                .addComponent(textCategoria, 120, 150, 250))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textQtde, 80, 100, 120)
                                .addGap(20)
                                .addComponent(jLabel2)
                                .addComponent(textImg, 150, 200, 400))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addComponent(textPeso, 70, 80, 100)
                                .addGap(15)
                                .addComponent(jLabel4)
                                .addComponent(textComprimento, 70, 80, 100)
                                .addGap(15)
                                .addComponent(jLabel9)
                                .addComponent(textLargura, 70, 80, 100)
                                .addGap(15)
                                .addComponent(jLabel10)
                                .addComponent(textAltura, 70, 80, 100))
                        .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel1Layout.createSequentialGroup()
                                .addGap(20)
                                .addComponent(addButton)
                                .addComponent(altButton)
                                .addComponent(delButton)
                                .addComponent(returnButton)
                                .addGap(20))
        );

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createSequentialGroup()
                        .addGap(10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(textIDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(readButton))
                        .addGap(20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(textCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(textQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(textImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(textPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(textComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(textLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(textAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30)
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
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String nome = textNome.getText();
            double preco = Double.parseDouble(textPreco.getText().replace(",", "."));
            String categoria = textCategoria.getText();
            int qtde = Integer.parseInt(textQtde.getText());
            String imagem = textImg.getText();
            String altura = textAltura.getText();
            String peso = textPeso.getText();
            String largura = textLargura.getText();
            String comprimento = textComprimento.getText();

            Produto novoProduto = new Produto();
            novoProduto.setNomeProduto(nome);
            novoProduto.setPreco(preco);
            novoProduto.setCategoria(categoria);
            novoProduto.setQtde(qtde);
            novoProduto.setImagem(imagem);
            novoProduto.setAltura(altura);
            novoProduto.setLargura(largura);
            novoProduto.setPeso(peso);
            novoProduto.setComprimento(comprimento);

            Produto_DAO.inserir(novoProduto);
            JOptionPane.showMessageDialog(null, "Produto inserido corretamente.");
            limparCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir produto: " + e.getMessage());
        }
    }

    private void altButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String nome = textNome.getText();
            double preco = Double.parseDouble(textPreco.getText().replace(",", "."));
            String categoria = textCategoria.getText();
            int qtde = Integer.parseInt(textQtde.getText());
            String imagem = textImg.getText();
            String altura = textAltura.getText();
            String peso = textPeso.getText();
            String largura = textLargura.getText();
            String comprimento = textComprimento.getText();
            int id = Integer.parseInt(textIDP.getText());

            Produto altProduto = new Produto();
            altProduto.setNomeProduto(nome);
            altProduto.setPreco(preco);
            altProduto.setCategoria(categoria);
            altProduto.setQtde(qtde);
            altProduto.setImagem(imagem);
            altProduto.setAltura(altura);
            altProduto.setPeso(peso);
            altProduto.setLargura(largura);
            altProduto.setComprimento(comprimento);
            altProduto.setIdProduto(id);

            Produto_DAO.atualizar(altProduto);
            JOptionPane.showMessageDialog(null, "Produto atualizado corretamente.");
            limparCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produto: " + e.getMessage());
        }
    }

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if(textIDP.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Digite o ID para excluir.");
                return;
            }

            int id = Integer.parseInt(textIDP.getText());
            Produto delProduto = new Produto();
            delProduto.setIdProduto(id);

            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o produto ID " + id + "?");
            if (confirm == JOptionPane.YES_OPTION) {
                Produto_DAO.deletar(delProduto);
                JOptionPane.showMessageDialog(null, "Produto excluído corretamente.");
                limparCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + e.getMessage());
        }
    }

    private void readButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if(textIDP.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Digite um ID para buscar.");
                return;
            }

            int id = Integer.parseInt(textIDP.getText());
            Produto readProduto = new Produto();
            readProduto.setIdProduto(id);

            readProduto = Produto_DAO.buscarPorId(readProduto);

            if (readProduto != null) {
                textNome.setText(readProduto.getNomeProduto());
                textCategoria.setText(readProduto.getCategoria());
                textPreco.setText(Double.toString(readProduto.getPreco()));
                textQtde.setText(Integer.toString(readProduto.getQtde()));
                textImg.setText(readProduto.getImagem());
                textPeso.setText(readProduto.getPeso());
                textAltura.setText(readProduto.getAltura());
                textLargura.setText(readProduto.getLargura());
                textComprimento.setText(readProduto.getComprimento());
            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado.");
                limparCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto: " + e.getMessage());
        }
    }

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {
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

        java.awt.EventQueue.invokeLater(() -> new Estoque_View().setVisible(true));
    }

    private javax.swing.JButton addButton;
    private javax.swing.JButton altButton;
    private javax.swing.JButton delButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField textAltura;
    private javax.swing.JTextField textCategoria;
    private javax.swing.JTextField textComprimento;
    private javax.swing.JTextField textIDP;
    private javax.swing.JTextField textImg;
    private javax.swing.JTextField textLargura;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textPeso;
    private javax.swing.JTextField textPreco;
    private javax.swing.JTextField textQtde;
}