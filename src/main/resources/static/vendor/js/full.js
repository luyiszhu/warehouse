var serviceModule = angular.module("serviceModule", ['ngResource']);

serviceModule.service("FullService", ['$resource', '$q', function ($resource, $q) {
    var resource = $resource('', {}, {
        findPosition: {
            method: 'GET',
            isArray: true,
            url: '/fulls'
        }

    });

    return {
        findPosition: function (begin, end) {
            var d = $q.defer();
            resource.findPosition({
                                  begin: begin,
                                  end: end
                              }, function (result) {
                d.resolve(result);
            }, function (result) {
                d.reject(result);
            });
            return d.promise;
        }
    }
}]);

var positionModule = angular.module('full', ['serviceModule']);

positionModule.controller("fullController", ['$scope', '$location', 'FullService', controller]);

function controller($scope, $location, FullService) {
    $scope.positions = [];

    $scope.query = function () {

        if (!$scope.begin) {
                   alert("请输入起始时间");
                   return;
        }
        if (!$scope.end) {
                   alert("请输入结束时间");
                   return;
        }


        FullService.findPosition($scope.begin,$scope.end)
            .then(function (result) {

                $scope.positions = result;
                	// 百度地图API功能
                var markers = [];
                var points = new Array();
                                angular.forEach($scope.positions, function(data,index,array){

                                    var pt = new BMap.Point(data.longitude, data.latitude);
                                    var myIcon;
                                    if(data.snr < 0)
                                    {
                                        myIcon = new BMap.Icon("/vendor/pic/bullet_red.png", new BMap.Size(32,32));
                                    }
                                    else if(data.snr >= 0 && data.snr < 100)
                                    {
                                        myIcon = new BMap.Icon("/vendor/pic/bullet_blue.png", new BMap.Size(32,32));
                                    }
                                    else if(data.snr >= 100 && data.snr < 200)
                                    {
                                        myIcon = new BMap.Icon("/vendor/pic/bullet_orange.png", new BMap.Size(32,32));
                                    }
                                    else
                                    {
                                        myIcon = new BMap.Icon("/vendor/pic/bullet_green.png", new BMap.Size(32,32));
                                    }
                                    //myIcon = new BMap.Icon("/vendor/pic/bullet_green.png", new BMap.Size(32,32));

                                    var marker2 = new BMap.Marker(pt,{icon:myIcon});  // 创建标注

                                    //markers.push(new BMap.Marker(point));
                                    map.addOverlay(marker2);
                                })

                //var markerClusterer = new BMapLib.MarkerClusterer(map, {markers:markers});



            })



    };



}
var map = new BMap.Map("allmap");
var point = new BMap.Point(116.404, 39.915);
map.centerAndZoom(point, 14);
map.enableScrollWheelZoom();
map.enableInertialDragging();

map.enableContinuousZoom();

var size = new BMap.Size(10, 20);
map.addControl(new BMap.CityListControl({
    anchor: BMAP_ANCHOR_TOP_LEFT,
    offset: size,
    // 切换城市之间事件
    // onChangeBefore: function(){
    //    alert('before');
    // },
    // 切换城市之后事件
    // onChangeAfter:function(){
    //   alert('after');
    // }
}));

	 $(".form_datetime").datetimepicker({
        format: "yyyy-mm-dd hh:ii",
        autoclose: true,
        todayBtn: true,
        pickerPosition: "bottom-left"
    });











