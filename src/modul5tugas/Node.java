/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5tugas;

/**
 *
 * @author User
 */
public class Node {

    protected int data;
    protected Node link;

    /*Constructor*/
    public Node()
    {
    link = null;
    data = 0;
    }
    /*Construction*/
    public Node (int d,Node n)
    {
    data = d;
    link = n;
    }

    Node(int val, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setLink(Node n)
    {
    link = n;
    }
    public void setData(int d)
    {
    data = d;
    }
    public Node getLink()
    {
    return link;         
    }
    public int getData()
    {
    return data;
    }
}
    
