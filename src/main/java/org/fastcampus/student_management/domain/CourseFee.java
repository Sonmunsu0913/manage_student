package org.fastcampus.student_management.domain;

public class CourseFee {

    private int fee;

    public CourseFee(int fee) {
        this.fee = fee;
    }

    public void changeFee(int fee) {
        this.fee = fee;
    }

    private void checkFee(int fee) {
        if (fee < 0) {
            throw new IllegalArgumentException("수강료는 0원 이상이어야 합니다.");
        }
    }

    public int getFee() {
        return fee;
    }
}
