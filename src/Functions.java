
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Functions {
   
//    static String myMethod(Object obj){
//    
//        System.out.println("Parsing object wiht this functio nhere");
//    }
     public static void addElelemntToList(JList list,Object obj ){
         
         DefaultListModel dl = new DefaultListModel();
         ListModel l = list.getModel();
         System.out.println("lista ka "+l.getSize()+ " elements");
         for (int i=0;i<l.getSize(); i++){
          //copy from listModel into DL
          dl.addElement(l.getElementAt(i));
             System.out.println("elementi qe shtohet "+l.getElementAt(i).toString());
         }
         System.out.println(obj);
         dl.addElement(obj);
//         d1.addElement(myMethod(obj));
         list.setModel(dl);
     
     }
    
}
