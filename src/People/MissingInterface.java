package People;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MissingInterface extends javax.swing.JFrame  {

	/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */

	/**
	 *
	 * @author RISHABH
	 */

	    /**
	     * Creates new form MissingInterface
	     */
	    public MissingInterface(String quake) {
	        initComponents();
	        this.setTitle("Victim's Profile");
	        this.setResizable(false);
	        this.quakeName = quake;
	    }

	    /**
	     * This method is called from within the constructor to initialize the form.
	     * WARNING: Do NOT modify this code. The content of this method is always
	     * regenerated by the Form Editor.
	     */
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        jLabel1 = new javax.swing.JLabel();
	        jRadioButton1 = new javax.swing.JRadioButton();
	        jRadioButton2 = new javax.swing.JRadioButton();
	        textField2 = new java.awt.TextField();
	        textField3 = new java.awt.TextField();
	        jComboBox1 = new javax.swing.JComboBox();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        jLabel5 = new javax.swing.JLabel();
	        jLabel6 = new javax.swing.JLabel();
	        jLabel7 = new javax.swing.JLabel();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();
	        textField4 = new java.awt.TextField();
	        jTextField1 = new javax.swing.JTextField();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel1.setText("NAME*");

	        jRadioButton1.setText(" Male");
	        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jRadioButton1ActionPerformed(evt);
	            }
	        });

	        jRadioButton2.setText("Female");
	        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jRadioButton2ActionPerformed(evt);
	            }
	        });

	        textField2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                textField2ActionPerformed(evt);
	            }
	        });

	        textField3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                textField3ActionPerformed(evt);
	            }
	        });

    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select","BLACK", "BROWN", "WHITE/FAIR"}));
	        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jComboBox1ActionPerformed(evt);
	            }
	        });

	        jLabel2.setText("GENDER");

	        jLabel3.setText("AGE");

	        jLabel4.setText("HEIGHT");

	        jLabel5.setText("SKIN COLOR");

	        jLabel6.setText("REMARK");

	        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
	        jLabel7.setText("VICTIM'S PROFILE");

	        jButton1.setText(" ADD ");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        jButton2.setText("SEARCH");
	        jButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton2ActionPerformed(evt);
	            }
	        });

	        textField4.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                textField4ActionPerformed(evt);
	            }
	        });

	        jTextField1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jTextField1ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap(25, Short.MAX_VALUE)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(jLabel2)
	                            .addComponent(jLabel3)
	                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                        .addGap(86, 86, 86)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(jRadioButton1)
	                                .addGap(18, 18, 18)
	                                .addComponent(jRadioButton2))
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                .addComponent(textField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(textField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 113, Short.MAX_VALUE))
	                            .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(20, 20, 20))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(26, 26, 26)
	                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(jButton2)
	                        .addGap(137, 137, 137))))
	            .addGroup(layout.createSequentialGroup()
	                .addGap(130, 130, 130)
	                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 0, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                        .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(10, 10, 10))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(jRadioButton1)
	                        .addComponent(jRadioButton2)))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(textField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel5))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel6)
	                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(32, 32, 32)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton1)
	                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addContainerGap())
	        );

	        pack();
	    }// </editor-fold>                        

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        // add button
	    	Profile person = getInput();
	    	if(person!=null){
	    		person.calcHashCode();
		    	boolean execute = Record.addRecord(person,quakeName);
		    	if(execute){
		    		JOptionPane.showMessageDialog(null, "Record Added Successfully", "Success", JOptionPane.PLAIN_MESSAGE);
		    	}
	    	}
	    }                                        
	    private Profile getInput(){
	    	Profile newPerson = new Profile();
	    	String name = textField4.getText();
	    	if(name==null||name.equals("")){
	    		JOptionPane.showMessageDialog(null, "Name of victim is required","Required", JOptionPane.PLAIN_MESSAGE);
	    		return null;
	    	}else{
	    		newPerson.setName(name);
	    		if(jRadioButton1.isSelected()){
	    			newPerson.setGender(1);
	    		}else if(jRadioButton2.isSelected()){
	    			newPerson.setGender(2);
	    		}
	    		try{
	    			int age = Integer.parseInt(textField2.getText());
	    			newPerson.setAge(age);
	    		}catch(Exception e){
	    			
	    		}
	    		try{
	    			float height = Float.parseFloat(textField3.getText());
	    			newPerson.setHeight(height);
	    		}catch(Exception e){
	    			
	    		}
	    		String skinColor = (String)(jComboBox1.getSelectedItem());
	    		if(!skinColor.equals("Select")){
	    			if(skinColor.equals("BLACK"))
	    				newPerson.setSkin(Profile.BLACK);
	    			else if(skinColor.equals("BROWN"))
	    				newPerson.setSkin(Profile.BROWN);
	    			else{
	    				newPerson.setSkin(Profile.WHITE);
	    			}
	    		}
	    		newPerson.setNotes(jTextField1.getText());
	    	}
	    	return newPerson;
	    }
	    private void textField4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
	        // TODO add your handling code here:
	    }                                          

	    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
	        // TODO add your handling code here:
	    }                                           

	    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        jRadioButton2.setSelected(false);
	        jRadioButton1.setSelected(true);
	    }                                             

	    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        jRadioButton1.setSelected(false);
	        jRadioButton2.setSelected(true);
	    }                                             

	    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
	        // TODO add your handling code here:
	    }                                          

	    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
	        // TODO add your handling code here:
	    }                                          

	    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
	        // TODO add your handling code here:
	    }                                          

	    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	       //SEARCH
	    	Profile person = getInput();
	    	
	    	ArrayList<Profile> potentialMatches = Record.searchRecord(person,quakeName);
	    	if(potentialMatches==null){
	    		potentialMatches = new ArrayList<Profile>();
	    	}else{
	    		for(int i=0;i<potentialMatches.size();i++){
		    		//age = 0 height = 0 skin = 'u'gender 0
		    		if(person.age!=0&&potentialMatches.get(i).age!=0){
		    			if(potentialMatches.get(i).age!=person.age){
		    				potentialMatches.remove(i);
		    				continue;
		    			}
		    		}
		    		if(person.gender!=0&&potentialMatches.get(i).gender!=0){
		    			if(potentialMatches.get(i).gender!=person.gender){
		    				potentialMatches.remove(i);
		    				continue;
		    			}
		    		}
		    		if(person.height!=0&&potentialMatches.get(i).height!=0){
		    			if(potentialMatches.get(i).height!=person.height){
		    				potentialMatches.remove(i);
		    				continue;
		    			}
		    		}
		    		if(person.skin!='u'&&potentialMatches.get(i).skin!='u'){
		    			if(potentialMatches.get(i).skin!=person.skin){
		    				potentialMatches.remove(i);
		    				continue;
		    			}
		    		}
		    	}
	    	}
	    	
	    	this.setVisible(false);
	    	this.dispose();
	    	new SearchResult(potentialMatches);
	    }                                        

	    /**
	     * @param args the command line arguments
	     */
	  /*  public static void main(String args[]) {
	        /* Set the Nimbus look and feel */
	        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
	         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	         */
	  /*      try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(MissingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(MissingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(MissingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(MissingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	     /*   java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new MissingInterface("NewName").setVisible(true);
	            }
	        });
	    }*/

	    // Variables declaration - do not modify 
	    private String quakeName;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JComboBox jComboBox1;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JLabel jLabel6;
	    private javax.swing.JLabel jLabel7;
	    private javax.swing.JRadioButton jRadioButton1;
	    private javax.swing.JRadioButton jRadioButton2;
	    private javax.swing.JTextField jTextField1;
	    private java.awt.TextField textField2;
	    private java.awt.TextField textField3;
	    private java.awt.TextField textField4;
	    // End of variables declaration                   
	
                 
	

}
