package com.example.weather.repository;

import com.example.weather.domain.Diary;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Integer> {

  List<Diary> findAllByDate(LocalDate date);

  List<Diary> findAllByDateBetween(LocalDate startDate, LocalDate endDate);

  Diary getFirstByDate(LocalDate date);

  void deleteAllByDate(LocalDate date);
}
