package by.epam.engtest.model.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import by.epam.engtest.model.Record;

public interface RecordRepository extends PagingAndSortingRepository<Record, Long> {

}
