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
public class main {
    
    public static void main(String[] args) {
        
        Timeline aliceTimeline = new Timeline();
        ArrayList aliceArrayList = new ArrayList();
        aliceTimeline.setTimelineArrayList(aliceArrayList);
        Posts alicePosts = new Posts();
        alicePosts.message = "I love the weather today.";
        alicePosts.dateTime = (String) java.time.LocalTime.now().toString();
        alicePosts.user = "alice";
        
        aliceTimeline.publish(alicePosts);
        aliceTimeline.viewTimeline();

        Timeline bobTimeline = new Timeline();
        ArrayList bobArrayList = new ArrayList();
        bobTimeline.setTimelineArrayList(bobArrayList);
        Posts bobPosts = new Posts();
        bobPosts.message = "Darn! We lost!";
        bobPosts.dateTime = (String) java.time.LocalTime.now().toString();
        bobPosts.user = "bob";
        bobTimeline.publish(bobPosts);
        bobTimeline.viewTimeline();
        
        bobPosts.message = "Good game though.";
        bobPosts.dateTime = (String) java.time.LocalTime.now().toString();
        bobTimeline.publish(bobPosts);
        bobTimeline.viewTimeline();
        
        Timeline charlieTimeline = new Timeline();
        ArrayList charlieArrayList = new ArrayList();
        charlieTimeline.setTimelineArrayList(charlieArrayList);
        Posts charliePosts = new Posts();
        charliePosts.message = "I'm in New York today! Anyone wants to have a coffee?";
        charliePosts.dateTime = (String) java.time.LocalTime.now().toString();
        charliePosts.user = "charlie";
        charlieTimeline.publish(charliePosts);
        
        charlieTimeline.viewTimeline(); 
    }
    
}
