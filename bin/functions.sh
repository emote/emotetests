#! /bin/bash

function runJetty()
{
    startpwd=$PWD
    CP=$testsdir/classes
    for jar in $testsdir/lib/*jar
    do
        CP="${CP}:${jar}"
    done
    tmpdir=/tmp/emoteTests.$$
    rm -rf $tmpdir
    mkdir -p $tmpdir
    mkdir -p $tmpdir/webapps/axis2
    cd $tmpdir/webapps/axis2
    jar xf $testsdir/war/axis2.war
    cp $testsdir/aar/*.aar WEB-INF/services
    cd $tmpdir
    java -classpath $CP com.emotive.jetty.Main > jetty.log 2>& 1&
    jettypid=$!
    cd $startpwd
    sleep 10
    echo $jettypid
}
