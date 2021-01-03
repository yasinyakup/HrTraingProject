package com.yaytech.traininglogic.repository;

import com.yaytech.traininglogic.dto.response.EmpTrainingResponseAsSingle;
import com.yaytech.traininglogic.dto.response.TrainingDto;
import com.yaytech.traininglogic.model.Employee;
import com.yaytech.traininglogic.model.PersonalTrainingRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonalTrainingRecordRepository extends JpaRepository<PersonalTrainingRecord, Long> {
    public List<PersonalTrainingRecord> findPersonalTrainingRecordByEmployee(Employee employee);

    @Query("select new com.yaytech.traininglogic.dto.response.TrainingDto(tf.employee.empNo, tf.employee.fullName, "  +
            " tf.trainingForm.training.trainingNo, tf.trainingForm.training.name, sum(tf.trainingForm.hour)) from  PersonalTrainingRecord tf" +
            " group by tf.employee.empNo,tf.employee.fullName, tf.trainingForm.training.trainingNo, tf.trainingForm.training.name")
    public List<TrainingDto> findAllRecord();



    @Query("select new com.yaytech.traininglogic.dto.response.EmpTrainingResponseAsSingle(e.empNo, e.fullName, e.dept.deptName, " +
            " e.title.title, tf.training.name, tf.archiveNo, "  +
            " sum(ptr.trainingForm.hour)) from  PersonalTrainingRecord ptr, TrainingForm tf, Employee e" +
            " where tf.id = ptr.id and ptr.employee.empNo = e.empNo"+
            " group by ptr.employee.empNo, ptr.trainingForm.training.trainingNo")
    public List<EmpTrainingResponseAsSingle> findAllRecord2();

    /*
      return EmpTrainingResponseAsSingle.builder()
              .empNo(trainingRecord.getEmployee().getEmpNo())
            .fullName(trainingRecord.getEmployee().getFullName())
            .dept(trainingRecord.getEmployee().getDept().getDeptName())
            .title(trainingRecord.getEmployee().getTitle().getTitle())
            .trainingName(trainingRecord.getTrainingForm().getTraining().getName())
            .archiveNo(trainingRecord.getTrainingForm().getArchiveNo())
            .hour(trainingRecord.getTrainingForm().getHour())
            .build();
*/
}
