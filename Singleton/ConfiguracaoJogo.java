public class ConfiguracaoJogo {
    private int appId;
    private String userName;
    private String language;
    private boolean offline;
    private boolean autoDLC;
    private int buildId;
    private String dlcName;
    private boolean updateDB;
    private String signature;
    private String windowInfo;
    private String lvWindowInfo;
    private String applicationPath;
    private String workingDirectory;
    private boolean waitForExit;
    private boolean noOperation;

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isOffline() {
        return offline;
    }

    public void setOffline(boolean offline) {
        this.offline = offline;
    }

    public boolean isAutoDLC() {
        return autoDLC;
    }

    public void setAutoDLC(boolean autoDLC) {
        this.autoDLC = autoDLC;
    }

    public int getBuildId() {
        return buildId;
    }

    public void setBuildId(int buildId) {
        this.buildId = buildId;
    }

    public String getDlcName() {
        return dlcName;
    }

    public void setDlcName(String dlcName) {
        this.dlcName = dlcName;
    }

    public boolean isUpdateDB() {
        return updateDB;
    }

    public void setUpdateDB(boolean updateDB) {
        this.updateDB = updateDB;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getWindowInfo() {
        return windowInfo;
    }

    public void setWindowInfo(String windowInfo) {
        this.windowInfo = windowInfo;
    }

    public String getLvWindowInfo() {
        return lvWindowInfo;
    }

    public void setLvWindowInfo(String lvWindowInfo) {
        this.lvWindowInfo = lvWindowInfo;
    }

    public String getApplicationPath() {
        return applicationPath;
    }

    public void setApplicationPath(String applicationPath) {
        this.applicationPath = applicationPath;
    }

    public String getWorkingDirectory() {
        return workingDirectory;
    }

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    public boolean isWaitForExit() {
        return waitForExit;
    }

    public void setWaitForExit(boolean waitForExit) {
        this.waitForExit = waitForExit;
    }

    public boolean isNoOperation() {
        return noOperation;
    }

    public void setNoOperation(boolean noOperation) {
        this.noOperation = noOperation;
    }
}
