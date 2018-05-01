import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ContactAs extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3187445043882286681L;
	private JLayeredPane contentPane;

	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	public static void main (String[] args) {
		ContactAs frame = new ContactAs();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public ContactAs() {
		setTitle("Contact");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 597);
		contentPane = new JLayeredPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		setUndercorated(true);
		
		JLabel label = new JLabel("Nume asociatie");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBorder(new LineBorder(Color.BLACK, 2));
		label.setBackground(Color.GRAY);
		
		JLabel label_1 = new JLabel("Asociatia de proprietari B-dul Revolutiei, nr 63, Arad");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel label_2 = new JLabel("Adresa");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_2.setBackground(Color.GRAY);
		
		JLabel label_4 = new JLabel("Asociatia de proprietari B-dul Revolutiei, nr 63, Arad");
		label_4.setVerticalAlignment(SwingConstants.TOP);
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel label_6 = new JLabel("Arad, B-dul Revolutiei, nr 63, jud Arad");
		label_6.setVerticalAlignment(SwingConstants.TOP);
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel label_8 = new JLabel("asociatiaproprev63@gmail.com");
		label_8.setVerticalAlignment(SwingConstants.TOP);
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel label_10 = new JLabel("38665036");
		label_10.setVerticalAlignment(SwingConstants.TOP);
		label_10.setForeground(Color.BLACK);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel lblRorzbr = new JLabel("RO22RZBR0000060020070558");
		lblRorzbr.setVerticalAlignment(SwingConstants.TOP);
		lblRorzbr.setForeground(Color.BLACK);
		lblRorzbr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRorzbr.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel label_14 = new JLabel("Gal Ovidiu");
		label_14.setVerticalAlignment(SwingConstants.TOP);
		label_14.setForeground(Color.BLACK);
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_14.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_14.setBackground(Color.LIGHT_GRAY);
		label_14.setAlignmentY(0.7f);
		
		JButton btnIesireButton = new JButton("Iesire");
		btnIesireButton.setForeground(Color.BLACK);
		btnIesireButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnIesireButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnIesireButton.setBackground(Color.LIGHT_GRAY);
		btnIesireButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel label_13 = new JLabel("Presedinte");
		label_13.setOpaque(true);
		label_13.setVerticalAlignment(SwingConstants.TOP);
		label_13.setForeground(Color.BLACK);
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_13.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_13.setBackground(Color.LIGHT_GRAY);
		label_13.setAlignmentY(0.7f);
		
		JLabel lblContBancar = new JLabel("Cont bancar");
		lblContBancar.setOpaque(true);
		lblContBancar.setBackground(Color.LIGHT_GRAY);
		lblContBancar.setVerticalAlignment(SwingConstants.TOP);
		lblContBancar.setForeground(Color.BLACK);
		lblContBancar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblContBancar.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel lblCodFiscal = new JLabel("Cod fiscal");
		lblCodFiscal.setBackground(Color.LIGHT_GRAY);
		lblCodFiscal.setOpaque(true);
		lblCodFiscal.setVerticalAlignment(SwingConstants.TOP);
		lblCodFiscal.setForeground(Color.BLACK);
		lblCodFiscal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCodFiscal.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel lblAdresaEmail = new JLabel("Adresa email");
		lblAdresaEmail.setOpaque(true);
		lblAdresaEmail.setBackground(Color.LIGHT_GRAY);
		lblAdresaEmail.setVerticalAlignment(SwingConstants.TOP);
		lblAdresaEmail.setForeground(Color.BLACK);
		lblAdresaEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAdresaEmail.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel lblAdresa = new JLabel("Adresa");
		lblAdresa.setBackground(Color.LIGHT_GRAY);
		lblAdresa.setOpaque(true);
		lblAdresa.setVerticalAlignment(SwingConstants.TOP);
		lblAdresa.setForeground(Color.BLACK);
		lblAdresa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAdresa.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel lblNumeAsociatie = new JLabel("Nume asociatie");
		lblNumeAsociatie.setOpaque(true);
		lblNumeAsociatie.setBackground(Color.LIGHT_GRAY);
		lblNumeAsociatie.setVerticalAlignment(SwingConstants.TOP);
		lblNumeAsociatie.setForeground(Color.BLACK);
		lblNumeAsociatie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumeAsociatie.setBorder(new LineBorder(new Color(0, 0, 0)));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_13, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
						.addComponent(lblRorzbr, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
						.addComponent(label_10, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
						.addComponent(label_8, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
						.addComponent(label_6, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
						.addComponent(btnIesireButton, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumeAsociatie, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
						.addComponent(label_4, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
						.addComponent(lblAdresa, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
						.addComponent(lblAdresaEmail, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
						.addComponent(lblCodFiscal, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
						.addComponent(lblContBancar, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
						.addComponent(label_14, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(lblNumeAsociatie, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(lblAdresa, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(lblAdresaEmail, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(lblCodFiscal, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(lblContBancar, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblRorzbr, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
					.addComponent(btnIesireButton))
		);
		contentPane.setLayout(gl_contentPane);
	}

	private void setUndercorated(boolean b) {
		// TODO Auto-generated method stub
		
	}

	protected autentificare autentificare() {
		return null;
		// TODO Auto-generated method stub
		//return null;
	}
}
