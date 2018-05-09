package jobook.repository.classes;

import jobook.cv.interfaces.CV;
import jobook.models.interfaces.job_package.Criteria;
import jobook.models.interfaces.job_package.Job;
import jobook.models.interfaces.root_package.User;
import jobook.models.interfaces.users_package.Employee;
import jobook.models.interfaces.users_package.Employer;
import jobook.repository.interfaces.Repository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.*;
import org.springframework.jdbc.core.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class Database implements Repository {
    private static final String SQL_INSERT_USER =
            "insert into jobook (e_mail, password, user,role) values (?, ?, ?, ?)";


    @Autowired
    private JdbcOperations jdbcOperations;



    public User findByName(String mail) {
        String sql = "SELECT user FROM jobook WHERE e_mail= '" + mail + "'";

        List<byte[]> user = jdbcOperations.query(sql, new RowMapper<byte[]>() {
            public byte[] mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getBytes(1);
            }

        });
        if(!user.isEmpty()){
            byte[] buf = user.get(0);
            try {
                ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(buf));
                return (User) ois.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

        return null;
    }

    public void addToDB(User user, String role) {
        jdbcOperations.update(SQL_INSERT_USER,user.getMail(), user.getPassword(), user , role );
    }

    public User getLoggedInUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        User user;
        if(name.equals("anonymousUser")){
            user = null;
        }
        else {
            user = findByName(name);

        }

        return user;
    }

    public boolean areCredentialsUnique(String mail) {
        return findByName(mail) == null;
    }

    public void linkJob(Employer employer, Job job) {
        String updateJob = "UPDATE jobook SET job= ? WHERE e_mail = ?";

        jdbcOperations.update(updateJob, job, employer.getMail());
    }


    @Override
    public CV findCVById(String id) {
        String sql = "SELECT cv FROM jobook WHERE id= '" + id + "'";

        List<byte[]> cv = jdbcOperations.query(sql, new RowMapper<byte[]>() {
            public byte[] mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getBytes(1);
            }

        });
        if (!cv.isEmpty()) {
            byte[] buf = cv.get(0);
            try {
                ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(buf));
                CV u = (CV) ois.readObject();
                return u;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public String findIDByUser(User user) {
       String id = "";
        try {
            String sql = "SELECT id FROM jobook WHERE e_mail = '" + user.getMail() + "'";

            id = jdbcOperations.queryForObject(sql, String.class);

        } catch (Exception e) {

        }
        return id;
    }

    public CV findCVByUser(User user) {
        String sql = "SELECT cv FROM jobook WHERE e_mail= '" + user.getMail() + "'";

        List<byte[]> cvs = jdbcOperations.query(sql, new RowMapper<byte[]>() {
            public byte[] mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getBytes(1);
            }

        });
        if(!cvs.isEmpty()){
            byte[] buf = cvs.get(0);
            try {
                ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(buf));
                CV cv = (CV) ois.readObject();
                return cv;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

        return null;

    }

    @Override
    public List<Job> getAllJobs() {
        String sql = "SELECT job FROM jobook WHERE role= 'employer'";

        List<Job> objects = new ArrayList<>();
        Job job = null;
        List<byte[]> jobs = jdbcOperations.query(sql, new RowMapper<byte[]>() {
            public byte[] mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getBytes(1);
            }

        });
        if(!jobs.isEmpty()){

            try {
                for (int i = 0; i < jobs.size(); i++) {
                    ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(jobs.get(i)));
                    job =((Job) ois.readObject());
                   if(job!=null) {
                       objects.add(job);
                   }
                }


            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }


        return objects;
    }

    @Override
    public Job findJobByUser(User user) {
        String sql = "SELECT job FROM jobook WHERE e_mail= '" + user.getMail() + "'";

        List<byte[]> jobs = jdbcOperations.query(sql, new RowMapper<byte[]>() {
            public byte[] mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getBytes(1);
            }

        });
        if(!jobs.isEmpty()){
            byte[] buf = jobs.get(0);
            try {
                ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(buf));
                Job job = (Job) ois.readObject();
                return job;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

        return null;
    }

    public List<CV> getAllCVs() {
        String sql = "SELECT cv FROM jobook WHERE role= 'employee'";

        List<CV> objects = new ArrayList<>();
        CV cv = null;
        List<byte[]> cvs = jdbcOperations.query(sql, new RowMapper<byte[]>() {
            public byte[] mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getBytes(1);
            }

        });
        if(!cvs.isEmpty()){

                try {
                    for (int i = 0; i < cvs.size(); i++) {
                        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(cvs.get(i)));
                        cv =((CV) ois.readObject());
                        if(cv!=null){
                            objects.add(cv);
                        }
                    }


                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
        }


        return objects;


    }



    public User findById(String id) {

        String sql = "SELECT user FROM jobook WHERE id= '" + id + "'";

        List<byte[]> user = jdbcOperations.query(sql, new RowMapper<byte[]>() {
            public byte[] mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getBytes(1);
            }

        });
        if(!user.isEmpty()){
            byte[] buf = user.get(0);
            try {
                ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(buf));
                User u =  (User) ois.readObject();
                return u;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

        return null;

    }

    public void linkCV(Employee employee, CV cv) {
        String updateCV = "UPDATE jobook SET cv= ? WHERE e_mail = ?";


        jdbcOperations.update(updateCV, cv, employee.getMail());
    }


    public CV findCVByCriteria(Criteria criteria) {
        return null;
    }

    public Job findJobByCriteria(Criteria criteria) {
        return null;
    }


    public void writeImg(User user , byte[] bytes) {
        String linkImg = "UPDATE jobook SET image = ? where e_mail = ?";
        jdbcOperations.update(linkImg, bytes , user.getMail());
    }

    public byte[] getImage(User user) {
        String sql = "SELECT image FROM jobook WHERE e_mail= '" + user.getMail() + "'";

        List<byte[]> image = jdbcOperations.query(sql, new RowMapper<byte[]>() {
            public byte[] mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getBytes(1);
            }

        });
        if(!image.isEmpty()){
            byte[] buf = image.get(0);
                return buf;
        }

        return null;
    }
}
