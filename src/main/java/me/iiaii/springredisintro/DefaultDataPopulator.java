package me.iiaii.springredisintro;

import me.iiaii.springredisintro.contentprovider.ContentProvider;
import me.iiaii.springredisintro.contentprovider.ContentProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

        contentProviderRepository.deleteAll();

        List<ContentProvider> inputs = new ArrayList<>();

        inputs.add(new ContentProvider("sbs", "image", "homepage"));
        inputs.add(new ContentProvider("sbs", "image", "homepage"));
        inputs.add(new ContentProvider("kbs", "image1", "homepage1"));
        inputs.add(new ContentProvider("kbs", "image1", "homepage1"));
        inputs.add(new ContentProvider("kbs", "image1", "homepage1"));
        inputs.add(new ContentProvider("mbc", "image2", "homepage2"));
        inputs.add(new ContentProvider("ebs", "image3", "homepage3"));


        for (ContentProvider cp : inputs) {
            ContentProvider findContentProvider = contentProviderRepository
                    .findByTitle(cp.getTitle())
                    .orElseGet(() -> contentProviderRepository.save(cp));

            System.out.println("findContentProvider = " + findContentProvider);
            System.out.println("--------------------");
        }

        contentProviderRepository
                .findAll()
                .forEach(System.out::println);

    }
}
