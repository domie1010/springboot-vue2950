const base = {
    get() {
        return {
            url : "http://localhost:8080/ssms046n/",
            name: "ssms046n",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssms046n/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "进出货管理系统"
        } 
    }
}
export default base
