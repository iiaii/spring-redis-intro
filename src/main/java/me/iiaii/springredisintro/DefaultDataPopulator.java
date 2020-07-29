package me.iiaii.springredisintro;

import me.iiaii.springredisintro.contentprovider.ContentProvider;
import me.iiaii.springredisintro.contentprovider.ContentProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DefaultDataPopulator implements ApplicationRunner {

    @Autowired
    MeetingRepository meetingRepository;

    @Autowired
    ContentProviderRepository contentProviderRepository;

    @Autowired
    StringRedisTemplate redisTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        Meeting meeting = new Meeting();
//        meeting.setTitle("New Meeting");
//        meeting.setStartAt(new Date());
//
//        meetingRepository.save(meeting);
//
//        meetingRepository.findAll().forEach(m -> {
//            System.out.println("===========");
//            System.out.println("m.getTitle() = " + m.getTitle());
//            System.out.println("m.getStartAt() = " + m.getStartAt());
//            System.out.println("===========");
//        });

        ContentProvider contentProvider = new ContentProvider();
        contentProvider.setTitle("SBS");
        contentProvider.setImage("image");
        contentProvider.setHompage("hompage");

        contentProviderRepository.save(contentProvider);

        contentProviderRepository.find


    }
}
