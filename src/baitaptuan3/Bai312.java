/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuan3;

import giaodienquanly.JManage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Admin
 */
public class Bai312 extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Bai12
     */
    public Bai312() {
        initComponents();
        btnBack.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 100));
        setResizable(false);

        jLabel1.setText("Bài 12: Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có phần đệm là  “Thị”.");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("package tuan4;\n\nimport java.util.ArrayList;\nimport java.util.Scanner;\n\npublic class BaiTap12 {\n    public static boolean checkName(String n){\n        String firstName;\n        String middleName;\n        String lastName;\n        int firstSpace = n.indexOf(\" \");\n        \n        if(firstSpace <0)return false;\n        \n        firstName = n.substring(0, firstSpace);\n        int secondSpace = n.indexOf(\" \", firstSpace + 1);\n        if (secondSpace < 0) { \n            lastName = n.substring(firstSpace + 1);\n            return false;\n        }else {\n            middleName = n.substring(firstSpace, secondSpace);\n            lastName = n.substring(secondSpace + 1);\n            if(\" Thi\".equals(middleName)){\n                return true;\n            }else return false;\n        }\n    }\n    public static void main(String[] args) {\n\n        ArrayList<String> name = new ArrayList();\n        Scanner scanner = new Scanner(System.in);\n        int cnt = 0;\n\n        System.out.println(\"Nhap so hoc sinh \");\n\n        int t = scanner.nextInt();\n        String answer = scanner.nextLine();\n        \n        for(int i =1; i < 1+t;i++){\n            System.out.println(\"Nhap ho ten hoc sinh thu \"+ i + \" : \");\n            answer = scanner.nextLine();\n            name.add(answer);\n        }\n\n        for (int i = 0; i < name.size(); i++) {\n            String n = name.get(i);\n            boolean c = checkName(n);\n            System.out.println(\" \" +(i+1)+\" : \"+ c);\n            if(checkName(n))cnt ++;\n        }\n        System.out.println(\"So hoc sinh co ten dem la \\\"Thi\\\" là: \" + cnt);\n        System.out.println(\"Nguyen Van Huong 20183550\");\n    }\n}\n");
        jScrollPane1.setViewportView(jTextArea1);

        btnBack.setText("Back");

        jLabel2.setText("TUẦN 3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bai312.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai312.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai312.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai312.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai312().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnBack)) {
            btnBackClick();
        }
    }

    public void btnBackClick() {
        new JManage().setVisible(true);
        this.dispose();
    }
}
