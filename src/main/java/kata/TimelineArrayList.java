/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

import java.util.ArrayList;

/**
 *
 * @author eyup
 */
public class TimelineArrayList {
    
    private ArrayList<Posts> myArrayList;
    
    public TimelineArrayList() {
        myArrayList = new ArrayList<>();
    } 
    
    public ArrayList getUserArrayList() {
        return myArrayList;
    }
    
    public void setUserArrayList(ArrayList userArrayList) {
        myArrayList = userArrayList;
    }    

    public int getUserArrayListSize() {
        return myArrayList.size();
    }
}
