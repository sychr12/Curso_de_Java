package entities;

import java.util.Date;
import Status.Main;

public class ordem {

    private Integer id;
    private Date moment;
    private Main status;

    private ordem() {

    }

        public ordem(Integer id, Date moment, Main status) {
            this.id = id;
            this.moment = moment;
            this.status = status;
        }

        public Integer getId() {
            return id;
        }

        public Date getMoment() {
            return moment;
        }

        public Main getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return "ordem [id=" + id + ", moment=" + moment + ", status=" + status + "]";
        }

    

}
