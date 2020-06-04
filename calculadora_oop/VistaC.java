package calculadora;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaC extends javax.swing.JFrame implements ActionListener {
	MetodosAritmeticos m = new MetodosAritmeticos();
	final static Color mycolor = new Color(102, 194, 255);// instacia de la clase color,lleva tres paremetros(rbg)

	public VistaC() {
		initComponents();
		setSize(320, 322);
		setResizable(false);
		panel1.setBackground(mycolor);
		setLocationRelativeTo(null);

	}

	private void initComponents() {

		jTextField3 = new javax.swing.JTextField();
		panel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		btnSumar = new javax.swing.JButton();
		btnRestar = new javax.swing.JButton();
		btnMulti = new javax.swing.JButton();
		btnDividir = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		txtNum1 = new javax.swing.JTextField();
		txtNum2 = new javax.swing.JTextField();
		txtResult = new javax.swing.JTextField();
		btnClear = new javax.swing.JButton();
		jTextField3.setText("jTextField3");
		btnRaiz = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		panel1.setLayout(null);

		jLabel1.setFont(new java.awt.Font("Open 24 Display St", 2, 25)); // NOI18N
		jLabel1.setText("Calculator java");
		panel1.add(jLabel1);
		jLabel1.setBounds(88, 0, 180, 24);
//botones
		btnSumar.setFont(new java.awt.Font("Open 24 Display St", 1, 25)); // NOI18N
		btnSumar.setText("+");
		panel1.add(btnSumar);
		btnSumar.setBounds(10, 260, 99, 29);
		btnSumar.addActionListener(this);

		btnRestar.setFont(new java.awt.Font("Open 24 Display St", 1, 25)); // NOI18N
		btnRestar.setText("-");
		panel1.add(btnRestar);
		btnRestar.setBounds(10, 220, 99, 29);
		btnRestar.addActionListener(this);

		btnMulti.setFont(new java.awt.Font("Open 24 Display St", 1, 25)); // NOI18N
		btnMulti.setText("*");
		panel1.add(btnMulti);
		btnMulti.setBounds(120, 220, 99, 29);
		btnMulti.addActionListener(this);

		btnDividir.setFont(new java.awt.Font("Open 24 Display St", 1, 25)); // NOI18N
		btnDividir.setText("/");
		panel1.add(btnDividir);
		btnDividir.setBounds(120, 260, 99, 29);
		btnDividir.addActionListener(this);
		// hecho a code
		btnRaiz.setFont(new java.awt.Font("Open 24 Display St", 1, 25)); // NOI18N;
		btnRaiz.setText("raiz");
		panel1.add(btnRaiz);
		btnRaiz.setBounds(230, 220, 80, 29);
		btnRaiz.addActionListener(this);

		btnClear.setFont(new java.awt.Font("Open 24 Display St", 1, 25)); // NOI18N
		btnClear.setText("CE");
		panel1.add(btnClear);
		btnClear.setBounds(230, 260, 80, 29);
		btnClear.addActionListener(this);
//labels
		jLabel2.setFont(new java.awt.Font("Open 24 Display St", 1, 17)); // NOI18N
		jLabel2.setText("Numero 1");
		panel1.add(jLabel2);
		jLabel2.setBounds(12, 55, 70, 15);

		jLabel3.setFont(new java.awt.Font("Open 24 Display St", 1, 17)); // NOI18N
		jLabel3.setText("Numero 2");
		panel1.add(jLabel3);
		jLabel3.setBounds(10, 110, 74, 15);

		jLabel4.setFont(new java.awt.Font("Open 24 Display St", 1, 17)); // NOI18N
		jLabel4.setText("Resultados");
		panel1.add(jLabel4);
		jLabel4.setBounds(10, 155, 99, 15);
//texts
		txtNum1.setFont(new java.awt.Font("Open 24 Display St", 1, 20)); // NOI18N
		panel1.add(txtNum1);
		txtNum1.setBounds(110, 50, 141, 28);

		txtNum2.setFont(new java.awt.Font("Open 24 Display St", 1, 20)); // NOI18N
		panel1.add(txtNum2);
		txtNum2.setBounds(110, 100, 141, 28);

		txtResult.setEditable(false);
		txtResult.setFont(new java.awt.Font("Open 24 Display St", 1, 20)); // NOI18N
		panel1.add(txtResult);
		txtResult.setBounds(110, 150, 141, 28);

		getContentPane().add(panel1);
		panel1.setBounds(0, 0, 320, 300);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnClear;
	private javax.swing.JButton btnDividir;
	private javax.swing.JButton btnMulti;
	private javax.swing.JButton btnRestar;
	private javax.swing.JButton btnSumar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JPanel panel1;
	private javax.swing.JTextField txtNum1;
	private javax.swing.JTextField txtNum2;
	private javax.swing.JTextField txtResult;
	private javax.swing.JButton btnRaiz;

	// End of variables declaration//GEN-END:variables
	// este metodo es solo una implementacion(tu lo usas como quieras)
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == btnSumar) {
				m.setNum1(Double.parseDouble(txtNum1.getText()));
				m.setNum2(Double.parseDouble(txtNum2.getText()));

				txtResult.setText(String.valueOf(m.sumar(m.getNum1(), m.getNum2())));

			} else if (e.getSource() == btnRestar) {
				m.setNum1(Double.parseDouble(txtNum1.getText()));
				m.setNum2(Double.parseDouble(txtNum2.getText()));

				txtResult.setText(String.valueOf(m.restar(m.getNum1(), m.getNum2())));

			} else if (e.getSource() == btnMulti) {
				m.setNum1(Double.parseDouble(txtNum1.getText()));
				m.setNum2(Double.parseDouble(txtNum2.getText()));

				txtResult.setText(String.valueOf(m.multi(m.getNum1(), m.getNum2())));

			} else if (e.getSource() == btnDividir) {
				m.setNum1(Double.parseDouble(txtNum1.getText()));
				m.setNum2(Double.parseDouble(txtNum2.getText()));

				txtResult.setText(String.valueOf(m.divid(m.getNum1(), m.getNum2())));

			} else if (e.getSource() == btnClear) {
				txtNum1.setText("");
				txtNum2.setText("");
				txtResult.setText("");

			} else if (e.getSource() == btnRaiz) {
				m.setNum1(Double.parseDouble(txtNum1.getText()));
				txtResult.setText(String.valueOf(m.root(m.getNum1())));
			}
		} catch (Exception e2) {
			txtResult.setText("Error");

		}

	}
}
