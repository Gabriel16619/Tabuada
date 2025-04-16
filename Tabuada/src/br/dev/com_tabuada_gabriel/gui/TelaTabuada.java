package br.dev.com_tabuada_gabriel.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import model.Tabuada;


public class TelaTabuada {

	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JScrollPane scrollTabuada;
	private JList listTabuada;

	private void exibirTabuada() {

	}

	private void limparTabuada() {

	}

	public void criarTelaTabuada() {

		JFrame tela = new JFrame();
		tela.setTitle("Tabuada");
		tela.setSize(300, 800);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);

		// componentes da tela
		// Multiplicando
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(20, 20, 150, 30);

		textMultiplicando = new JTextField();
		textMultiplicando.setText(null);
		textMultiplicando.setBounds(170, 20, 40, 30);

		// MinMuntiplicador
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Min.Multiplicador:");
		labelMinMultiplicador.setBounds(20, 55, 150, 30);

		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setText(null);
		textMinMultiplicador.setBounds(170, 60, 40, 30);

		// max.Multiplicador
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Max.Multiplicador:");
		labelMaxMultiplicador.setBounds(20, 90, 150, 30);

		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setText(null);
		textMaxMultiplicador.setBounds(170, 100, 40, 30);

		// buttons
		buttonCalcular = new JButton();
		buttonCalcular.setBounds(20, 140, 100, 40);
		buttonCalcular.setText("Calcular");

		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(150, 140, 100, 40);
		buttonLimpar.getText();

		// criar um objeto Scroll

		listTabuada = new JList();

		scrollTabuada = new JScrollPane(listTabuada);
		scrollTabuada.setBounds(20, 240, 180, 400);

		// bagui para add os textos
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(textMultiplicando);

		tela.getContentPane().add(labelMinMultiplicador);
		tela.getContentPane().add(textMinMultiplicador);

		tela.getContentPane().add(labelMaxMultiplicador);
		tela.getContentPane().add(textMaxMultiplicador);

		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);

		tela.getContentPane().add(scrollTabuada);

		// Add ouvintes de eventos nos botões
		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Tabuada tabuada = new Tabuada();

				String multiplicando = textMultiplicando.getText();
				double multiplicandoDouble = Double.valueOf(multiplicando);
				tabuada.setMultiplicando(multiplicandoDouble);

				String minMultiplicando = textMinMultiplicador.getText();
				double minMultiplicandoDouble = Double.valueOf(minMultiplicando);
				tabuada.setMultiplicando(minMultiplicandoDouble);

				String maxMultiplicando = textMaxMultiplicador.getText();
				double maxMultiplicandoDouble = Double.valueOf(maxMultiplicando);
				tabuada.setMultiplicando(maxMultiplicandoDouble);
				
			

			
			}
		});

		buttonLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textMultiplicando.setText("");
				textMinMultiplicador.setText("");
				textMaxMultiplicador.setText("");

				textMultiplicando.requestFocus();

			}

		});

		// ultima linha desse metodo.
		tela.setVisible(true);

	}

}
