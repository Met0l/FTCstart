package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Hardware {
    //creare
    private DcMotor frontRight = null;
    private DcMotor frontLeft = null;
    private DcMotor backRight = null;
    private DcMotor backLeft = null;

    HardwareMap hardwareMap = null;
    private ElapsedTime runtime = new ElapsedTime();

    private Hardware(HardwareMap hwMap) {
        initialize(hwMap);
    }

    private void initialize(HardwareMap hwMap){
        hardwareMap = hwMap;

        //conectare motoare
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        backRight = hardwareMap.get(DcMotor.class, "backRight");
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");

        //directia motoarelor
        frontRight.setDirection(DcMotor.Direction.FORWARD);
        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backRight.setDirection(DcMotor.Direction.FORWARD);
        backLeft.setDirection(DcMotor.Direction.REVERSE);

        //zero power behaviour
        frontRight.getZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontLeft.getZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.getZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.getZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        //no power??
        frontRight.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        backLeft.setPower(0);
    }
}
