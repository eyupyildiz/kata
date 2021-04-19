/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author eyup
 */
public class Timeline {
    TimelineArrayList timelineArrayList;

    public Timeline() {
        timelineArrayList = new TimelineArrayList();
    }
   
    public void setTimelineArrayList (ArrayList myArrayList) {
        timelineArrayList.setUserArrayList(myArrayList);
    }
    
    public void publish(Posts myPosts) {
        timelineArrayList.getUserArrayList().add(myPosts);
    }
    
    public void viewTimeline()
    {
    /*
        System.out.println("ArrayList size: " + timelineArrayList.getUserArrayListSize());
        int arrayListSize = timelineArrayList.getUserArrayListSize();
               
        for(int i = 0; i < arrayListSize; i++)
        {
           System.out.println((String) (timelineArrayList.getUserArrayList().get(i).toString()));
        }
        */
        Iterator itr=timelineArrayList.getUserArrayList().iterator();  

        //traverse elements of ArrayList object  
        while(itr.hasNext()){  
            Posts st=(Posts)itr.next();  
            System.out.println(st.message+" "+st.dateTime+" "+st.user);  
        }  
        
        
    }    
    
       
    
}
