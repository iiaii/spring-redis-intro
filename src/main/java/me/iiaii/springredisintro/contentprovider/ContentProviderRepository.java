package me.iiaii.springredisintro.contentprovider;

import org.springframework.data.repository.CrudRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface ContentProviderRepository extends CrudRepository<ContentProvider, String> {
    Optional<ContentProvider> findByTitle(String title);

    Optional<ContentProvider> findContentProviderByTitle(String title);

    Optional<ContentProvider> findAllByTitle(String title);
}
