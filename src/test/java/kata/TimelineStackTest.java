package kata;

import java.util.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimelineStackTest {
    Stack stack = new Stack();
    
    @Test
    void testTimelineStack() {
        TimelineStack timelineStack = new TimelineStack();
        timelineStack.pushMessageToTimeline(stack, "This is a test message1");
        assertEquals("This is a test message1",timelineStack.popMessageFromTimeline(stack));

        timelineStack.pushMessageToTimeline(stack, "This is a test message2");
        assertEquals("This is a test message2",timelineStack.popMessageFromTimeline(stack));
        
        timelineStack.pushMessageToTimeline(stack, "This is a test message3");
        assertEquals("This is a test message3",timelineStack.popMessageFromTimeline(stack));

        timelineStack.pushMessageToTimeline(stack, "This is a test message4");
        assertEquals("This is a test message4",timelineStack.popMessageFromTimeline(stack));
    }

}
