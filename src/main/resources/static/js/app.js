$(document).ready(function () {
  //console.log("ready");

  initPage();

  function initPage() {
    loadTenDaiMN();
  }

  function loadTenDaiMN() {
    $.ajax({
      type: "POST",
      url: "api/dai/findAll",
      data: {
        command: "ListDai",
      },
      success: function (data, textStatus, xhr) {
        if (xhr.status == 200 && textStatus == "success") {
          var selectDai = $(".listDai");
          //console.log(selectDai);
          //console.log(data);
          for (var i = 0; i < data.length; i++) {
            //console.log(data[i].name);
            selectDai.append(
              "<option value=" + data[i].id + ">" + data[i].name + "</option>"
            );
          }
        }
      },
      complete: function (xhr, textStatus) {},
    });
  }

  $(".listDai").on("change", function (e) {
    var daiSelected = $(".listDai").val();
    let daiContentSelected = $(".listDai").find(":selected").text();
    //console.log(daiSelected);
    console.log(daiContentSelected);
    //loadTable($("#listDai").val());
    $.ajax({
      type: "POST",
      url: "/api/daimn/findByDai",
      data: {
        command: "ThongKeMienNam",
        id: daiSelected,
        dai: daiContentSelected,
      },
      success: function (data, textStatus, xhr) {
        if (xhr.status == 200 && textStatus == "success") {
          console.log("load mn" + data.length);
        }
      },
      complete: function (xhr, textStatus) {},
    });
  });

  // Document Ready
});
