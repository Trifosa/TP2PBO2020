import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Image;

public class Awal extends JFrame{
	
	public Awal(){
		Initialize();
	}
	
	@SuppressWarnings("unchecked")
	private void Initialize(){
		
		// Yang akan dipakai untuk GUI
		jBtnPinjam = new JButton();
		jBtnPanjang = new JButton();
		jBtnKembali = new JButton();
		jLblAku = new JLabel();
		jPanel = new JPanel();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Halaman Awal");
		setResizable(true);
		
		jLblAku.setText("Misael Trifosa - 1805100");	// Ceritanya footer
		
		// Setting untuk button peminjaman
		jBtnPinjam.setText("Peminjaman");
		jBtnPinjam.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				jBtnPinjamActionPerformed(evt);
			}
		});
		
		// Setting untuk button pengembalian
		jBtnKembali.setText("Pengembalian");
		jBtnKembali.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				jBtnKembaliActionPerformed(evt);
			}
		});
		
		// Setting untuk button perpanjangan
		jBtnPanjang.setText("Perpanjangan");
		jBtnPanjang.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				jBtnPanjangActionPerformed(evt);
			}
		});
		
		jPanel.setBorder(BorderFactory.createEtchedBorder());
		javax.swing.GroupLayout jPanelLayout = new GroupLayout(jPanel);
		jPanel.setLayout(jPanelLayout);
		
		// Setting layout horizontal
		jPanelLayout.setHorizontalGroup(
			jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanelLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(jPanelLayout.createSequentialGroup()
						.addGap(18, 18, 18)
						
						.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(jBtnPinjam, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
							.addComponent(jBtnKembali, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
							.addComponent(jBtnPanjang, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
						
						.addGap(18, 18, 18)
						
						.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(jLblAku))
					)
				)
				.addContainerGap()
			)
		);
		
		// Setting layout vertical
		jPanelLayout.setVerticalGroup(
			jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanelLayout.createSequentialGroup()
				.addContainerGap()
				
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(jBtnPinjam))
				
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(jBtnKembali))
				
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(jBtnPanjang))
					
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(jLblAku))
			)
		);
				
				GroupLayout layout = new GroupLayout(getContentPane());
				getContentPane().setLayout(layout);
				layout.setHorizontalGroup(
					layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(jPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							)
						.addContainerGap())
					);
					layout.setVerticalGroup(
						layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGap(13, 13, 13)
							)
						);
						
						pack();	
	}
	
	// Action yang dilakukan ketika klik button pinjam
	private void jBtnPinjamActionPerformed(java.awt.event.ActionEvent evt){
		//Awal.this.setVisible(false);
		Awal.this.dispose();			// Untuk menutup form awal
		Pinjam baru = new Pinjam();		// Untuk memanggil form pinjam
		baru.setVisible(true);
	}
	
	// Action yang dilakukan ketika klik button panjang
	private void jBtnPanjangActionPerformed(java.awt.event.ActionEvent evt){
		Awal.this.dispose();			// Untuk menutup form awal
		Panjang baru = new Panjang();	// Untuk memanggil form panjang
		baru.setVisible(true);
	}
	
	// Action yang dilakukan ketika klik button kembali
	private void jBtnKembaliActionPerformed(java.awt.event.ActionEvent evt){
		Awal.this.dispose();			// Untuk menutup form awal
		Kembali baru = new Kembali();	// Untuk memanggil form kembali
		baru.setVisible(true);
	}
	
	//@param args
	
	public static void main(String arg[]){
		try{
			for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
				if("Nimbus".equals(info.getName())){
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex){
			java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex){
			java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex){
			java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex){
			java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run(){
				new Awal().setVisible(true);
			}
		});
	}
	
	protected JButton jBtnPinjam;
	protected JButton jBtnKembali;
	protected JButton jBtnPanjang;
	private JLabel jLblAku;
	private JPanel jPanel;
}

/*
Saya Misael Trifosa mengerjakan evaluasi TP2 dalam mata kuliah Pemrograman Berorientasi Objek
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/