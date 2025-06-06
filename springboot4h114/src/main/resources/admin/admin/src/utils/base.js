const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot4h114/",
            name: "springboot4h114",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot4h114/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "儿童预防接种预约微信小程序"
        } 
    }
}
export default base
