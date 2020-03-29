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

public class Kembali extends JFrame{
	
	ArrayList<Data> dataList;
	String header[] = new String[] {"Kode Buku", "Nama Buku", "Nama Peminjam", "Tanggal Pinjam", "Tanggal Pengembalian"};
	DefaultTableModel dtm;
	int row, col;
	
	public Kembali(){
		Initialize();
		dataList = new ArrayList<>();
		dtm = new DefaultTableModel(header, 0);
		jTable.setModel(dtm);
		this.setLocationRelativeTo(null);
	}
	
	@SuppressWarnings("unchecked")
	private void Initialize(){
		
		// Yang akan dipakai untuk GUI
		jTable = new JTable();
		jBtnPengembalian = new JButton();
		jBtnKembali = new JButton();
		jLblKode = new JLabel();
		jTFKode = new JTextField();
		jLblAku = new JLabel();
		jPanel = new JPanel();
		jScrollPane = new JScrollPane();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Pengembalian");
		setResizable(false);
		
		jTable.setModel(new DefaultTableModel(
			new Object [][]{
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null}
			},
			new String [] {
				"Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
			}
		));
		
		jScrollPane.setViewportView(jTable);
		
		// Set label
		jLblKode.setText("Kode Buku");
		jLblAku.setText("Misael Trifosa - 1805100");	// Ceritanya footer		
		
		// Setting untuk button pengembalian
		jBtnPengembalian.setText("Pengembalian");
		jBtnPengembalian.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				jBtnPengembalianActionPerformed(evt);
			}
		});
		
		// Setting untuk button kembali
		jBtnKembali.setText("Kembali");
		jBtnKembali.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				jBtnKembaliActionPerformed(evt);
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
						.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(jLblKode))
							
						.addGap(18, 18, 18)
						
						.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(jTFKode)
							.addComponent(jBtnPengembalian, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
							
						.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(jBtnKembali, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
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
					.addComponent(jLblKode)
					.addComponent(jTFKode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(jBtnPengembalian)
					.addComponent(jBtnKembali))
				
				.addGap(18, 18, 18)
				
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(jLblAku))
					
					.addContainerGap()
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
							.addComponent(jScrollPane)
							)
						.addContainerGap())
					);
					layout.setVerticalGroup(
						layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(jScrollPane, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
							.addGap(13, 13, 13)
							)
						);
						
						pack();	
	}
	
	private void jBtnPengembalianActionPerformed(java.awt.event.ActionEvent evt){
		clearField();
	}
	
	private void jBtnKembaliActionPerformed(java.awt.event.ActionEvent evt){
		Kembali.this.dispose();			// Untuk menutup form kembali
		Awal baru = new Awal();			// Untuk memanggil form awal
		baru.jBtnKembali.setVisible(false);	// Menyembunyikan button
		baru.setVisible(true);
		//baru.jBtnKembali.setEnabled(false);	// Untuk membuat button tidak bisa diklik
	}
	
	private void clearField(){
		jTFKode.requestFocus();
		jTFKode.setText("");
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
			java.util.logging.Logger.getLogger(Kembali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex){
			java.util.logging.Logger.getLogger(Kembali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex){
			java.util.logging.Logger.getLogger(Kembali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex){
			java.util.logging.Logger.getLogger(Kembali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run(){
				new Kembali().setVisible(true);
			}
		});
	}
	
	private JTable jTable;
	private JButton jBtnPengembalian;
	private JButton jBtnKembali;
	private JLabel jLblKode;
	private JTextField jTFKode;
	private JLabel jLblAku;
	private JPanel jPanel;
	private JScrollPane jScrollPane;
}

/*
Saya Misael Trifosa mengerjakan evaluasi TP2 dalam mata kuliah Pemrograman Berorientasi Objek
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/