package raisentech.Student.Management;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import raisentech.Student.Management.data.Student;
import raisentech.Student.Management.data.StudentsCourses;

/**
 * 受講生テーブルと受講生コース情報テーブルと紐づくRepositoryです。
 */
@Mapper
public interface StudentRepository {

  /**
   * 受講生の全件検索を行います。ただし論理削除された受講生は除く。
   * @return 受講生一覧（全件）
   */
  List<Student> search();

  /**
   * 受講生の検索を行います。
   * @param id 受講生ID
   * @return 受講生
   */
  Student findStudent(int id);

  /**
   * 受講生IDに紐づく受講生のコース情報を検索します。
   * @param studentId 受講生ID
   * @return 受講生IDに紐づく受講生コース情報
   */
  List<StudentsCourses> findStudentCourses(int studentId);
  // 新規受講生情報をデータベースに登録
  void insertStudent(Student student);  // 引数としてStudentオブジェクトを受け取る
  //コース情報をデータベースへ登録
  void  registerStudentsCourses(StudentsCourses studentsCourses);
//受講生更新処理
  int updateStudent(Student student);
  // コース情報更新処理
  int updateCourse(StudentsCourses studentsCourses);




}





