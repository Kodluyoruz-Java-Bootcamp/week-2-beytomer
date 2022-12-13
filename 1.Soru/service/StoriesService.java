package mediumCom.service;

import mediumCom.dao.StoryDao;
import mediumCom.model.Story;
import mediumCom.model.StoryType;
import mediumCom.model.User;

import java.util.List;

public class StoriesService {

    private StoryDao storyDao=new StoryDao();
    private UserService userService=new UserService();

    public void createStory(Story story){
        storyDao.saveStories(story);
    }

    public List<Story> getAll(){
        return storyDao.getStoryList();
    }

    public void deleteStory(Story story){
        storyDao.deleteStory(story);
        System.out.println(story.getNo()+". Story Silindi ..");
    }

    public List<Story>getAllStoriesByUser(String name){
        return getAll().stream().filter(it ->it.getUser().getName().equals(name)).toList();
    }

    public List<Story>getSameStoryTag(StoryType storyType){
        return getAll().stream().filter(it ->it.getType().equals(storyType)).toList();
    }


}
