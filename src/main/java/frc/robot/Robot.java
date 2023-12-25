package frc.robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {

  private NetworkTable limelight = NetworkTableInstance.getDefault().getTable("limelight-front");
  private double tx;
  private double ty;
  private double ta;

  /**
    * 此函數在機器人首次啟動時運行，適用於任何
    * 初始化程式碼。
    */
  @Override
  public void robotInit() {}

  /**
    * 無論模式如何，函數每 20 ms 呼叫一次。 將其用於診斷等項目
    * 您希望在停用、自主、遙控和測試期間運作。
    *
    * <p>它在模式特定週期函數之後運行，但在 LiveWindow 和
    * SmartDashboard整合更新。
    */
  @Override
  public void robotPeriodic() {}

  /**
    * 這個自治（以及上面的選擇器代碼）顯示瞭如何在不同的之間進行選擇
    * 使用儀表板的自主模式。 可傳送的選擇器程式碼與 Java 一起使用
    * 智慧儀表板。 如果您喜歡 LabVIEW 儀表板，請刪除所有選擇器程式碼並
    * 取消註解 getString 行以從陀螺儀下方的文字方塊中取得自動名稱
    *
    * <p>您可以透過在開關結構上添加額外的比較來添加額外的自動模式
    * 下面帶有附加字串。 如果使用 SendableChooser 請確保將它們添加到
    * 上面還有選擇器代碼。
    */
  @Override
  public void autonomousInit() {}

  /** 該函數在自治期間被定期呼叫。 */
  @Override
  public void autonomousPeriodic() {}

  /** 當 teleop 啟用時，函數被呼叫一次。 */
  @Override
  public void teleopInit() {}

  /** 此函數在操作員控制期間定期呼叫。 */
  @Override
  public void teleopPeriodic() {
    tx = limelight.getEntry("tx").getDouble(0.0);
    ty = limelight.getEntry("ty").getDouble(0.0);
    ta = limelight.getEntry("ta").getDouble(0.0);

    SmartDashboard.putNumber("tx", tx);
    SmartDashboard.putNumber("ty", ty);
    SmartDashboard.putNumber("ta", ta);
  }

  /** 當機器人被停用時，函數被呼叫一次。 */
  @Override
  public void disabledInit() {}

  /** 該函數在停用時會定期呼叫。 */
  @Override
  public void disabledPeriodic() {}

  /** 啟用測試模式時，此函數被呼叫一次。 */
  @Override
  public void testInit() {}

  /** 在測試模式期間定期呼叫此函數。 */
  @Override
  public void testPeriodic() {}

  /** 此函數在機器人首次啟動時呼叫一次。 */
  @Override
  public void simulationInit() {}

  /** 在模擬過程中定期呼叫此函數。 */
  @Override
  public void simulationPeriodic() {}
}
