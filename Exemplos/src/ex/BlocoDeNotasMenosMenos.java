package ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class BlocoDeNotasMenosMenos extends JFrame {
    JMenuBar barraDeMenu = new JMenuBar();
    JMenu menuArquivo = new JMenu("Arquivo");
    JMenu menuEditar = new JMenu("Editar");
    JMenu menuAjuda = new JMenu("Ajuda");
    JMenuItem itemNovo = new JMenuItem("Novo");
    JMenuItem itemAbrir = new JMenuItem("Abrir");
    JMenuItem itemSalvar = new JMenuItem("Salvar");
    JMenuItem itemSair = new JMenuItem("Sair");
    JMenuItem itemCopiar = new JMenuItem("Copiar");
    JMenuItem itemRecortar = new JMenuItem("Recortar");
    JMenuItem itemColar = new JMenuItem("Colar");
    JMenuItem itemSobre = new JMenuItem("Sobre");
    
    JTextArea area = new JTextArea();
    JScrollPane painel = new JScrollPane(area, 
                                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    
    public BlocoDeNotasMenosMenos() {
        setTitle("Bloco de Notas --");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(barraDeMenu);
        barraDeMenu.add(menuArquivo);
        barraDeMenu.add(menuEditar);
        barraDeMenu.add(menuAjuda);
        menuArquivo.add(itemNovo);
        menuArquivo.add(itemAbrir);
        menuArquivo.add(itemSalvar);
        menuArquivo.add(itemSair);
        menuEditar.add(itemCopiar);
        menuEditar.add(itemRecortar);
        menuEditar.add(itemColar);
        menuAjuda.add(itemSobre);
        add(painel);
        
        itemSobre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, 
                        "Programa Bloco de Notas --\n\n"
                                + "Desenvolvido pela turma EMI Informática 2B"
                                + "\nSince 2025\n\nNenhum direito reservado.", 
                        "Bloco de Notas --", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        itemNovo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setText("");
            }
        });
        itemSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
//                dispose();
            }
        });
        itemAbrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                int opcao = chooser.showOpenDialog(rootPane);
                if(opcao == JFileChooser.APPROVE_OPTION) {
//                    File arquivo = new File("arquivo.txt");
                    File arquivo = chooser.getSelectedFile();
                    byte[] conteudo = new byte[(int) arquivo.length()];
                    try {
                    FileInputStream fis = new FileInputStream(arquivo);
                    fis.read(conteudo);
                    fis.close();
                    } catch(FileNotFoundException fnfe) {
                        JOptionPane.showMessageDialog(rootPane, 
                                "O arquivo não foi encontrado.", 
                                "Bloco de Notas--", JOptionPane.ERROR_MESSAGE);
                    } catch(IOException ioe) {
                        JOptionPane.showMessageDialog(rootPane, 
                                "Ocorreu um erro na leitura do arquivo.", 
                                "Bloco de Notas--", JOptionPane.ERROR_MESSAGE);
                    }
                    String texto = new String(conteudo);
                    area.setText(texto);
                }
            }
        });
        itemSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = area.getText();
                byte[] conteudo = texto.getBytes();
                JFileChooser chooser = new JFileChooser();
                int opcao = chooser.showSaveDialog(rootPane);
                if(opcao == JFileChooser.APPROVE_OPTION) {
//                    File arquivo = new File("arquivo.txt");
                    File arquivo = chooser.getSelectedFile();
                    try {
                        FileOutputStream fos = new FileOutputStream(arquivo);
                        fos.write(conteudo);
                        fos.close();
                    } catch(FileNotFoundException fnfe) {
                        JOptionPane.showMessageDialog(rootPane, "O arquivo não foi encontrado.", "Bloco de Notas--", JOptionPane.ERROR_MESSAGE);
                    } catch(IOException ioe) {
                        JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro na gravação do arquivo.", "Bloco de Notas--", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        itemCopiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.copy();
            }
        });
        itemRecortar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.cut();
            }
        });
        itemColar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.paste();
            }
        });
    }
    
    public static void main(String[] args) {
        BlocoDeNotasMenosMenos janela = new BlocoDeNotasMenosMenos();
        janela.setSize(400, 400);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }
}
