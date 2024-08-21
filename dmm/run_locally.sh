#!/usr/bin/env bash

export FIREBALL_MD_DMMAPP=`pwd`

PROFILE=$1
BUILD_OR_RUN=$2

if [  ! -z "$1" ]; then
	PROFILE=$1
else	
	PROFILE='default'
fi

echo "Using Profile = $PROFILE"

if [  ! -z "$2"  ]; then
	if [ $BUILD_OR_RUN = 'b' ]; then
		echo "Running clean install"
		mvn clean install -Pjs-debug,no-docker -DskipTests=true
	fi 
fi



SPRING_PROFILES_ACTIVE="$PROFILE" java -jar target/dmm-*.jar --HOSTNAME=local