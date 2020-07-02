package animal;

public class ObserverMain {

	public static void main(String[] args) {


		Topic topic = new Topic();
		Observer sub1 = new TopicSubscriber("Top Subscriber 1");
		Observer sub2 = new TopicSubscriber("Top Subscriber 2");
		Observer sub3 = new TopicSubscriber("Top Subscriber 3");
		
		topic.subscribe(sub1);
		topic.subscribe(sub2);
		topic.subscribe(sub3);
		
		topic.setName("New topic");
		topic.setName("Another topic");
	}

}
