package mediumCom.dao;

import mediumCom.model.Story;

import java.util.ArrayList;
import java.util.List;

public class StoryDao {

    private static List<Story>storyList=new ArrayList<>();

    public void saveStories(Story story){
        storyList.add(story);
    }

    public List<Story>getStoryList(){
        return  storyList;
    }

    public void deleteStory(Story story){
        storyList.remove(story);
    }
}
