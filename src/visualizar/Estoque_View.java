/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visualizar;

import DAO.Produto_DAO;
import javax.swing.JOptionPane;
import modelos.Produto;

/**
 *
 * @author tabaxco
 */
public class Estoque_View extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Estoque_View.class.getName());

    public Estoque_View() {
        initComponents();
        setTitle("Gerenciamento de Estoque");
        setLocationRelativeTo(null); // Centraliza na tela
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        // Inicialização dos componentes
        jLabel8 = new javax.swing.JLabel("ID do Produto:");
        textIDP = new javax.swing.JTextField();
        readButton = new javax.swing.JButton("Buscar");

        jLabel1 = new javax.swing.JLabel("Nome:");
        textNome = new javax.swing.JTextField();

        jLabel5 = new javax.swing.JLabel("Preço:");
        textPreco = new javax.swing.JTextField();

        jLabel6 = new javax.swing.JLabel("Categoria:");
        textCategoria = new javax.swing.JTextField();

        jLabel7 = new javax.swing.JLabel("Quantidade:");
        textQtde = new javax.swing.JTextField();

        jLabel2 = new javax.swing.JLabel("Imagem (URL):");
        textImg = new javax.swing.JTextField();

        // Dimensões
        jLabel3 = new javax.swing.JLabel("Peso:");
        textPeso = new javax.swing.JTextField();

        jLabel4 = new javax.swing.JLabel("Comprimento:");
        textComprimento = new javax.swing.JTextField();

        jLabel9 = new javax.swing.JLabel("Largura:");
        textLargura = new javax.swing.JTextField();

        jLabel10 = new javax.swing.JLabel("Altura:");
        textAltura = new javax.swing.JTextField();

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

        // Cria espaçamento automático (o segredo para ficar bonito)
        jPanel1Layout.setAutoCreateGaps(true);
        jPanel1Layout.setAutoCreateContainerGaps(true);

        // GRUPO HORIZONTAL (Colunas)
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        // Linha de Busca (ID)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addComponent(textIDP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(readButton))

                        // Linha do Nome
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textNome))

                        // Linha Preço e Categoria
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30)
                                .addComponent(jLabel6)
                                .addComponent(textCategoria))

                        // Linha Quantidade e Imagem
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30)
                                .addComponent(jLabel2)
                                .addComponent(textImg))

                        // Linha Separadora Visual (apenas lógica)

                        // Linha de Dimensões (Peso/Comp/Larg/Alt) - Tudo numa linha só ou duas
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(textPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(textComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(textLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(textAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))

                        // Linha dos Botões (Centralizados ou justificados)
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

                        // Linha Busca
                        .addGap(10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(textIDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(readButton))
                        .addGap(20) // Espaço maior após a busca

                        // Linha Nome
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                        // Linha Preço/Cat
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(textCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                        // Linha Qtde/Img
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(textQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(textImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                        .addGap(20) // Espaço antes das dimensões

                        // Labels das dimensões
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))

                        // Campos das dimensões
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                        .addGap(30) // Espaço para os botões

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

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String nome = textNome.getText();
        double preco = Double.parseDouble(textPreco.getText());
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

        try {
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
            double preco = Double.parseDouble(textPreco.getText());
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produto: " + e.getMessage());
        }
    }

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int id = Integer.parseInt(textIDP.getText());
            Produto delProduto = new Produto();
            delProduto.setIdProduto(id);

            // Adicionei confirmação de segurança
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir?");
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
            int id = Integer.parseInt(textIDP.getText());
            Produto readProduto = new Produto();
            readProduto.setIdProduto(id);

            readProduto = Produto_DAO.buscarPorId(readProduto);

            if (readProduto != null) {
                textNome.setText(readProduto.getNomeProduto());
                textCategoria.setText(readProduto.getCategoria());
                // Removi o "R$" aqui para evitar erros se você clicar em Alterar logo depois de buscar
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

    private void textIDPActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // new MenuPrincipal().setVisible(true); // Descomente se tiver o menu
        dispose();
    }

    // Método auxiliar para limpar campos
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
        java.awt.EventQueue.invokeLater(() -> new Estoque_View().setVisible(true));
    }

    // Variables declaration - do not modify
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
    // End of variables declaration
}