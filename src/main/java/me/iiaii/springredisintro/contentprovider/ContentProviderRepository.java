package me.iiaii.springredisintro.contentprovider;

import org.springframework.data.repository.CrudRepository;

public interface ContentProviderRepository extends CrudRepository<ContentProvider, String> {
}
