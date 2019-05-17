#!/bin/sh
LOG_DIRECTORY=/opt/spring-dependency-injection/logs
mkdir -p $LOG_DIRECTORY
if [ ! -d "$LOG_DIRECTORY" ]; then
  echo "ERROR: could not find log direcrtory"
fi
