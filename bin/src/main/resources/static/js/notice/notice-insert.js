//230705 06, 0706 07
let oEditors = [];
nhn.husky.EZCreator.createInIFrame({
  oAppRef: oEditors,
  elPlaceHolder: "ir1",
  sSkinURI: "/static/SmartEditor2Skin.html",
  fCreator: "createSEditor2"
});

const submitButton = document.querySelector(".submit");

submitButton.onclick = () => {
  oEditors.getById["ir1"].exec("UPDATE_CONTENTS_FIELD", []);
  const textarearValue = document.querySelector("#ir1").value;
  alert(textarearValue);
  
  let formData = new FormData(document.querySelector("form"));
  
  formData.append("userCode", getUser().user_code);
  
  formData.forEach((v, k) => {
	  console.log("key: " + k);
	  console.log("value: " + v);
  })  
  
  $.ajax({
	  async: false,
	  type: "post",
	  url: "/api/v1/notice",
	  enctype: "multipart/form-data",
	  contentType: false,
	  processData: false,
	  data: formData,
	  dataType: "json",
	  success: (response) => {
		  alert(response.data + "번 공지사항 작성완료")
		  location.href = "/notice/detail/" + response.data;
	  },
	  error: (error) => {
		  console.log(error);
	  }
  })
}