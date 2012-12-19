var util = require('util');
var fs = require('fs');
var assert = require('assert');

var session;

module.exports = function(sessionParam,cb) {
    session = sessionParam;
    console.log('Starting test');
    session.directive({
        op: "INVOKE", 
        targetType: "weather_ServiceType", 
        name: "GetCityWeatherByZIP",
        params :
        {
            "ZIP": "94612"
        }
    },function(err,result) {
        assert.ifError(err);
        assert.equal(1, result.count);
        assert.equal("SUCCESS", result.status);
        assert.ok(result.results[0].Success);
        assert.equal("Oakland", result.results[0].City);
        console.log('Test succeeded');
        cb();
    });
}
