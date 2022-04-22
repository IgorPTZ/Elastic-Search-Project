package elasticsearch.project.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import elasticsearch.project.document.Person;

public interface PersonRepository extends ElasticsearchRepository<Person, String>{

}
