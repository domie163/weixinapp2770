<template>
	<view class="content">
		<form class="app-update-pv">
			
									<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">账号</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(247, 6, 6, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.zhanghao" v-model="ruleForm.zhanghao" placeholder="账号"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">监护人姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(247, 6, 6, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jianhurenxingming" v-model="ruleForm.jianhurenxingming" placeholder="监护人姓名"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">儿童姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(247, 6, 6, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.ertongxingming" v-model="ruleForm.ertongxingming" placeholder="儿童姓名"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">接种编号</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(247, 6, 6, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jiezhongbianhao" v-model="ruleForm.jiezhongbianhao" placeholder="接种编号"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">出生日期</view>
				<picker mode="date" :value="ruleForm.chushengriqi" @change="chushengriqiChange">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(242, 8, 8, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.chushengriqi?ruleForm.chushengriqi:"请选择出生日期"}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">儿童性别</view>
				<picker @change="ertongxingbieChange" :value="ertongxingbieIndex" :range="ertongxingbieOptions">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(242, 8, 8, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.ertongxingbie?ruleForm.ertongxingbie:"请选择儿童性别"}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">孕期周数</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(247, 6, 6, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.yunqizhoushu" v-model="ruleForm.yunqizhoushu" placeholder="孕期周数"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">出生身高</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(247, 6, 6, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.chushengshengao" v-model="ruleForm.chushengshengao" placeholder="出生身高"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">出生体重</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(247, 6, 6, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.chushengtizhong" v-model="ruleForm.chushengtizhong" placeholder="出生体重"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">儿童过敏史</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(247, 6, 6, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.ertongguominshi" v-model="ruleForm.ertongguominshi" placeholder="儿童过敏史"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">监护人电话</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(247, 6, 6, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jianhurendianhua" v-model="ruleForm.jianhurendianhua" placeholder="监护人电话"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">儿童关系</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(247, 6, 6, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.ertongguanxi" v-model="ruleForm.ertongguanxi" placeholder="儿童关系"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">家庭住址</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(247, 6, 6, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jiatingzhuzhi" v-model="ruleForm.jiatingzhuzhi" placeholder="家庭住址"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="zhaopianTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">照片</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-if="ruleForm.zhaopian" :src="ruleForm.zhaopian" mode="aspectFill"></image>
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
									
			<!-- 否 -->
 
			
			          				          				          				          				          				          				          				          				          				          				          				          				          				          							
			          				          				          				          				          				          				          				          				          				          				          				          				          				          							
			<view class="btn">
				<button :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(0, 204, 0, 1)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"8rpx","color":"#fff","borderWidth":"1","width":"80%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

																																																													
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
												zhanghao: '',
																jianhurenxingming: '',
																ertongxingming: '',
																jiezhongbianhao: '',
																chushengriqi: '',
																ertongxingbie: '',
																yunqizhoushu: '',
																chushengshengao: '',
																chushengtizhong: '',
																ertongguominshi: '',
																jianhurendianhua: '',
																ertongguanxi: '',
																jiatingzhuzhi: '',
																zhaopian: '',
												},
																																																				ertongxingbieOptions: [],
				ertongxingbieIndex: 0,
																																																																												// 登陆用户信息
				user: {},
                                ro:{
                                   zhanghao : false,
                                   jianhurenxingming : false,
                                   ertongxingming : false,
                                   jiezhongbianhao : false,
                                   chushengriqi : false,
                                   ertongxingbie : false,
                                   yunqizhoushu : false,
                                   chushengshengao : false,
                                   chushengtizhong : false,
                                   ertongguominshi : false,
                                   jianhurendianhua : false,
                                   ertongguanxi : false,
                                   jiatingzhuzhi : false,
                                   zhaopian : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
						// ss读取
									this.ruleForm.zhanghao = this.user.zhanghao
												this.ruleForm.jianhurenxingming = this.user.jianhurenxingming
												this.ruleForm.ertongxingming = this.user.ertongxingming
												this.ruleForm.jiezhongbianhao = this.user.jiezhongbianhao
																																																																					
																																										// 自定义下拉框值
			this.ertongxingbieOptions = "男,女".split(',')
																																																									
			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`ertongxinxi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='zhanghao'){
					this.ruleForm.zhanghao = obj[o];
					this.ro.zhanghao = true;
					continue;
					}
					if(o=='jianhurenxingming'){
					this.ruleForm.jianhurenxingming = obj[o];
					this.ro.jianhurenxingming = true;
					continue;
					}
					if(o=='ertongxingming'){
					this.ruleForm.ertongxingming = obj[o];
					this.ro.ertongxingming = true;
					continue;
					}
					if(o=='jiezhongbianhao'){
					this.ruleForm.jiezhongbianhao = obj[o];
					this.ro.jiezhongbianhao = true;
					continue;
					}
					if(o=='chushengriqi'){
					this.ruleForm.chushengriqi = obj[o];
					this.ro.chushengriqi = true;
					continue;
					}
					if(o=='ertongxingbie'){
					this.ruleForm.ertongxingbie = obj[o];
					this.ro.ertongxingbie = true;
					continue;
					}
					if(o=='yunqizhoushu'){
					this.ruleForm.yunqizhoushu = obj[o];
					this.ro.yunqizhoushu = true;
					continue;
					}
					if(o=='chushengshengao'){
					this.ruleForm.chushengshengao = obj[o];
					this.ro.chushengshengao = true;
					continue;
					}
					if(o=='chushengtizhong'){
					this.ruleForm.chushengtizhong = obj[o];
					this.ro.chushengtizhong = true;
					continue;
					}
					if(o=='ertongguominshi'){
					this.ruleForm.ertongguominshi = obj[o];
					this.ro.ertongguominshi = true;
					continue;
					}
					if(o=='jianhurendianhua'){
					this.ruleForm.jianhurendianhua = obj[o];
					this.ro.jianhurendianhua = true;
					continue;
					}
					if(o=='ertongguanxi'){
					this.ruleForm.ertongguanxi = obj[o];
					this.ro.ertongguanxi = true;
					continue;
					}
					if(o=='jiatingzhuzhi'){
					this.ruleForm.jiatingzhuzhi = obj[o];
					this.ro.jiatingzhuzhi = true;
					continue;
					}
					if(o=='zhaopian'){
					this.ruleForm.zhaopian = obj[o];
					this.ro.zhaopian = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
																																																																																										
			// 多级联动参数
																																																																																										
																																	chushengriqiChange(e) {
				this.ruleForm.chushengriqi = e.target.value;
				this.$forceUpdate();
			},
																																																												
																																																																																							
																																							// 下拉变化
			ertongxingbieChange(e) {
				this.ertongxingbieIndex = e.target.value
				this.ruleForm.ertongxingbie = this.ertongxingbieOptions[this.ertongxingbieIndex]
			},
																																																						
																																																																																																																														zhaopianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.zhaopian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
									
			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								if(this.ruleForm.id){
					await this.$api.update(`ertongxinxi`, this.ruleForm);
				}else{
					await this.$api.add(`ertongxinxi`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-image: url(http://codegen.caihongy.cn/20201207/18e60648bb684cf196230ae29d4e8f96.jpg);
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 88rpx;
	}
	
	.select .uni-input {
		line-height: 88rpx;
	}
	
	.input .right-input {
		line-height: 88rpx;
	}
</style>
