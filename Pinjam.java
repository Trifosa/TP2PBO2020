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

public class Pinjam extends JFrame{
	
	ArrayList<Data> dataList;
	String header[] = new String[] {"Kode Buku", "Nama Buku", "Nama Peminjam", "Tanggal Pinjam", "Tanggal Pengembalian"};
	DefaultTableModel dtm;
	int row, col;
	
	public Pinjam(){
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
		jBtnPinjam = new JButton();
		jBtnKembali = new JButton();
		jLblKode = new JLabel();
		jLblBuku = new JLabel();
		jLblNama = new JLabel();
		jLblPinjam = new JLabel();
		jLblKembali = new JLabel();
		jTFKode = new JTextField();
		jTFBuku = new JTextField();
		jTFNama = new JTextField();
		jTFPinjam = new JTextField();
		jTFKembali = new JTextField();
		jLblAku = new JLabel();
		jPanel = new JPanel();
		jScrollPane = new JScrollPane();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Peminjaman");
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
		jLblAku.setText("Misael Trifosa - 1805100");	// Ceritanya footer
		
		// Set label
		jLblKode.setText("Kode Buku");
		jLblBuku.setText("Nama Buku");
		jLblNama.setText("Nama Peminjam");
		jLblPinjam.setText("Tanggal Pinjam");
		jLblKembali.setText("Tanggal Pengembalian");
		
		// Setting untuk button pinjam
		jBtnPinjam.setText("Pinjam");
		jBtnPinjam.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				jBtnPinjamActionPerformed(evt);
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
							.addComponent(jLblKode)
							.addComponent(jLblBuku)
							.addComponent(jLblNama)
							.addComponent(jLblPinjam)
							.addComponent(jLblKembali))
							
						.addGap(18, 18, 18)
						
						.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(jTFKode)
							.addComponent(jTFBuku)
							.addComponent(jTFNama)
							.addComponent(jTFPinjam)
							.addComponent(jTFKembali, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addComponent(jBtnPinjam, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
							
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
				
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(jLblBuku)
					.addComponent(jTFBuku, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(jLblNama)
					.addComponent(jTFNama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(jLblPinjam)
					.addComponent(jTFPinjam, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(jLblKembali)
					.addComponent(jTFKembali, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(jBtnPinjam)
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
	
	private void jBtnPinjamActionPerformed(java.awt.event.ActionEvent evt){
		String kode = jTFKode.getText();
		String buku = jTFBuku.getText();
		String nama = jTFNama.getText();
		String tgl1 = jTFPinjam.getText();
		String tgl2 = jTFKembali.getText();
		dataList.add(new Data(kode, buku, nama, tgl1, tgl2));
		dtm.setRowCount(0);
		for(int i = 0; i < dataList.size(); i++){
			Object[] objs = {i+1, dataList.get(i).kode,
								dataList.get(i).buku,
								dataList.get(i).nama,
								dataList.get(i).pinjam,
								dataList.get(i).kembali};
			dtm.addRow(objs);
		}
		clearField();
	}
	
	private void jBtnKembaliActionPerformed(java.awt.event.ActionEvent evt){
		Pinjam.this.dispose();			// Untuk menutup form pinjam
		Awal baru = new Awal();			// Untuk memanggil form awal
		baru.jBtnPinjam.setVisible(false);	// Menyembunyikan button
		baru.setVisible(true);
		//baru.jBtnPinjam.setEnabled(false);	// Untuk membuat button tidak bisa duklik
	}
	
	private void clearField(){
		jTFKode.requestFocus();
		jTFKode.setText("");
		jTFBuku.setText("");
		jTFNama.setText("");
		jTFPinjam.setText("");
		jTFKembali.setText("");
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
			java.util.logging.Logger.getLogger(Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex){
			java.util.logging.Logger.getLogger(Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex){
			java.util.logging.Logger.getLogger(Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex){
			java.util.logging.Logger.getLogger(Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run(){
				new Pinjam().setVisible(true);
			}
		});
	}
	
	private JTable jTable;
	private JButton jBtnPinjam;
	private JButton jBtnKembali;
	private JLabel jLblKode;
	private JLabel jLblBuku;
	private JLabel jLblNama;
	private JLabel jLblPinjam;
	private JLabel jLblKembali;
	private JTextField jTFKode;
	private JTextField jTFBuku;
	private JTextField jTFNama;
	private JTextField jTFPinjam;
	private JTextField jTFKembali;
	private JLabel jLblAku;
	private JPanel jPanel;
	private JScrollPane jScrollPane;
}

/*
Saya Misael Trifosa mengerjakan evaluasi TP2 dalam mata kuliah Pemrograman Berorientasi Objek
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/