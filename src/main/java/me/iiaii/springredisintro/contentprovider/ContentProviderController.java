package me.iiaii.springredisintro.contentprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentProviderController {

    @Autowired
    ContentProviderRepository contentProviderRepository;

    @PostMapping("/cp")
    public void createContentProvider() {

    }
}
