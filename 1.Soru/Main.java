package mediumCom;

import mediumCom.model.Story;
import mediumCom.model.StoryType;
import mediumCom.model.User;
import mediumCom.service.StoriesService;
import mediumCom.service.UserService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User userMerve=new User("Merve","merve@gmail.com","123", Collections.emptyList());
        User userBeytullah=new User("Beytullah","beyto@gmail.com","321",Collections.emptyList());
        User userZeki=new User("Zeki","zeki@gmail.com","321",Collections.emptyList());

        UserService userService=new UserService();

        userService.createUser(userZeki);
        userService.createUser(userMerve);
        userService.createUser(userBeytullah);

        StoriesService storiesService=new StoriesService();

        Story story=new Story();
        story.setName("Ali Baba Kırk Haramileri");
        story.setNo(100L);
        story.setText("asfasdhsfjdgdjsfhfjddhjgdj");
        story.setUser(userZeki);
        story.setType(StoryType.STORY);
        storiesService.createStory(story);

        Story story1=new Story();
        story1.setName("Su içmenin yararları");
        story1.setNo(101L);
        story1.setText("asfasdhsfjdgdjsfhfjddhjgdj");
        story1.setUser(userMerve);
        story1.setType(StoryType.INFORMATION);
        storiesService.createStory(story1);

        Story story2=new Story();
        story2.setName("En soğuk sıcaklık -273");
        story2.setNo(102L);
        story2.setText("asfasdhsfjdgdjsfhfjddhjgdj");
        story2.setUser(userBeytullah);
        story2.setType(StoryType.SICIENCE);
        storiesService.createStory(story2);

        Story story3=new Story();
        story3.setName("Java");
        story3.setNo(103L);
        story3.setText("asfasdhsfjdgdjsfhfjddhjgdj");
        story3.setUser(userBeytullah);
        story3.setType(StoryType.SOFTWARE);
        storiesService.createStory(story3);

        Story story4=new Story();
        story4.setName("Bremen mızıkacıları");
        story4.setNo(104L);
        story4.setText("asfasdhsfjdgdjsfhfjddhjgdj");
        story4.setUser(userMerve);
        story4.setType(StoryType.STORY);
        storiesService.createStory(story4);

        //Yayınlanan bloglar
        System.out.println();
        System.out.println("Yayınlanan bloglar");
        storiesService.getAll().forEach(System.out::println);

        //istenilen bloğu silme
        System.out.println();
        storiesService.deleteStory(story2);

        // Silindikten sonraki Story listesinin son hali
        System.out.println();
        storiesService.getAll().forEach(System.out::println);

        //Kullanıcıları takip etme
        userBeytullah.getFollowedList().add(userMerve);
        userBeytullah.getFollowedList().add(userZeki);

        //userBeytullahın Takip ettiği kullanıcılar
        System.out.println();
        System.out.println("userBeytullah takip ettiği kullanıcılar");
        userBeytullah.getFollowedList().forEach(System.out::println);

        //Kişilerin bloglarını listeleme
        System.out.println();
        System.out.println("userMerve kullanıcısının blogları");
        storiesService.getAllStoriesByUser("Merve").forEach(System.out::println);

        //Kullanıcıların tagleri takip etmesi
        System.out.println();
        System.out.println("Tag i STORY olan yazılar");
        storiesService.getSameStoryTag(StoryType.STORY).forEach(System.out::println);

    }
}
