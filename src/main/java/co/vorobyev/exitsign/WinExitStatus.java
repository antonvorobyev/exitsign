/*
Copyright 2015 Anton Vorobyev
Licensed under the Apache License, Version 2.0 (the "License");

you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*/

package co.vorobyev.exitsign;

/**
 * Enumeration class collecting exit statuses peculiar to
 * Windows software.
 *
 * {@see http://msdn.microsoft.com/en-us/library/ms681381(v=vs.85).aspx}
 *
 * @author <a href="http://vorobyev.co">Anton Vorobyev</a>
 * @since 0.1
 */
public enum WinExitStatus implements ExitStatus {

    /** Successful termination. */
    SUCCESS(0, "The operation completed successfully", ""),

    /** Incorrect function. */
    INVALID_FUNCTION(1, "Incorrect function", ""),

    /** The system cannot find the file specified. */
    FILE_NOT_FOUND(2, "The system cannot find the file specified", ""),

    /** The system cannot find the path specified. */
    PATH_NOT_FOUND(3, "The system cannot find the path specified", ""),

    /** The system cannot open the file. */
    TOO_MANY_OPEN_FILES(4, "The system cannot open the file", ""),

    /** Access is denied. */
    ACCESS_DENIED(5, "Access is denied", ""),

    /** The handle is invalid. */
    INVALID_HANDLE(6, "The handle is invalid", ""),

    /** The storage control blocks were destroyed. */
    ARENA_TRASHED(7, "The storage control blocks were destroyed", ""),

    /** Not enough storage is available to process this command. */
    NOT_ENOUGH_MEMORY(8, "Not enough storage is available to process this command", ""),

    /** The storage control block address is invalid. */
    INVALID_BLOCK(9, "The storage control block address is invalid", ""),

    /** The environment is incorrect. */
    BAD_ENVIRONMENT(10, "The environment is incorrect", ""),

    /** An attempt was made to load a program with an incorrect format. */
    BAD_FORMAT(11, "An attempt was made to load a program with an incorrect format", ""),

    /** The access code is invalid. */
    INVALID_ACCESS(12, "The access code is invalid", ""),

    /** The data is invalid. */
    INVALID_DATA(13, "The data is invalid", ""),

    /** Not enough storage is available to complete this operation. */
    OUTOFMEMORY(14, "Not enough storage is available to complete this operation", ""),

    /** The system cannot find the drive specified. */
    INVALID_DRIVE(15, "The system cannot find the drive specified", ""),

    /** The directory cannot be removed. */
    CURRENT_DIRECTORY(16, "The directory cannot be removed", ""),

    /** The system cannot move the file to a different disk drive. */
    NOT_SAME_DEVICE(17, "The system cannot move the file to a different disk drive", ""),

    /** There are no more files. */
    NO_MORE_FILES(18, "There are no more files", ""),

    /** The media is write protected. */
    WRITE_PROTECT(19, "The media is write protected", ""),

    /** The system cannot find the device specified. */
    BAD_UNIT(20, "The system cannot find the device specified", ""),

    /** The device is not ready. */
    NOT_READY(21, "The device is not ready", ""),

    /** The device does not recognize the command. */
    BAD_COMMAND(22, "The device does not recognize the command", ""),

    /** Data error (cyclic redundancy check). */
    CRC(23, "Data error (cyclic redundancy check)", ""),

    /** The program issued a command but the command length is incorrect. */
    BAD_LENGTH(24, "The program issued a command but the command length is incorrect", ""),

    /** The drive cannot locate a specific area or track on the disk. */
    SEEK(25, "The drive cannot locate a specific area or track on the disk", ""),

    /** The specified disk or diskette cannot be accessed. */
    NOT_DOS_DISK(26, "The specified disk or diskette cannot be accessed", ""),

    /** The drive cannot find the sector requested. */
    SECTOR_NOT_FOUND(27, "The drive cannot find the sector requested", ""),

    /** The printer is out of paper. */
    OUT_OF_PAPER(28, "The printer is out of paper", ""),

    /** The system cannot write to the specified device. */
    WRITE_FAULT(29, "The system cannot write to the specified device", ""),

    /** The system cannot read from the specified device. */
    READ_FAULT(30, "The system cannot read from the specified device", ""),

    /** A device attached to the system is not functioning. */
    GEN_FAILURE(31, "A device attached to the system is not functioning", ""),

    /** The process cannot access the file because it is being used by another process. */
    SHARING_VIOLATION(32, "The process cannot access the file because it is being used by another process", ""),

    /** The process cannot access the file because another process has locked a portion of the file. */
    LOCK_VIOLATION(33, "The process cannot access the file because another process has locked a portion of the file", ""),

    /** The wrong diskette is in the drive. */
    WRONG_DISK(34, "The wrong diskette is in the drive", ""),

    /** Too many files opened for sharing. */
    SHARING_BUFFER_EXCEEDED(36, "Too many files opened for sharing", ""),

    /** Reached the end of the file .*/
    HANDLE_EOF(38, "Reached the end of the file", ""),

    /** The disk is full. */
    HANDLE_DISK_FULL(39, "The disk is full", ""),

    /** The request is not supported. */
    NOT_SUPPORTED(50, "The request is not supported", ""),

    /** Windows cannot find the network path. */
    REM_NOT_LIST(51, "Windows cannot find the network path", ""),

    /** You were not connected because a duplicate name exists on the network. */
    DUP_NAME(52, "You were not connected because a duplicate name exists on the network", ""),

    /** The network path was not found. */
    BAD_NETPATH(53, "The network path was not found", ""),

    /** The network is busy. */
    NETWORK_BUSY(54, "The network is busy", ""),

    /** The specified network resource or device is no longer available. */
    DEV_NOT_EXIST(55, "The specified network resource or device is no longer available", ""),

    /** The network BIOS command limit has been reached. */
    TOO_MANY_CMDS(56, "The network BIOS command limit has been reached", ""),

    /** A network adapter hardware error occurred. */
    ADAP_HDW_ERR(57, "A network adapter hardware error occurred", ""),

    /** The specified server cannot perform the requested operation. */
    BAD_NET_RESP(58, "The specified server cannot perform the requested operation", ""),

    /** An unexpected network error occurred. */
    UNEXP_NET_ERR(59, "An unexpected network error occurred", ""),

    /** The remote adapter is not compatible. */
    BAD_REM_ADAP(60, "The remote adapter is not compatible", ""),

    /** The printer queue is full. */
    PRINTQ_FULL(61, "The printer queue is full", ""),

    /** Space to store the file waiting to be printed is not available on the server. */
    NO_SPOOL_SPACE(62, "Space to store the file waiting to be printed is not available on the server", ""),

    /** Your file waiting to be printed was deleted. */
    PRINT_CANCELLED(63, "Your file waiting to be printed was deleted", ""),

    /** The specified network name is no longer available. */
    NETNAME_DELETED(64, "The specified network name is no longer available", ""),

    /** Network access is denied. */
    NETWORK_ACCESS_DENIED(65, "Network access is denied", ""),

    /** The network resource type is not correct. */
    BAD_DEV_TYPE(66, "The network resource type is not correct", ""),

    /** The network name cannot be found. */
    BAD_NET_NAME(67, "The network name cannot be found", ""),

    /** The name limit for the local computer network adapter card was exceeded. */
    TOO_MANY_NAMES(68, "The name limit for the local computer network adapter card was exceeded", ""),

    /** The network BIOS session limit was exceeded. */
    TOO_MANY_SESS(69, "The network BIOS session limit was exceeded", ""),

    /** The remote server has been paused or is in the process of being started. */
    SHARING_PAUSED(70, "The remote server has been paused or is in the process of being started", ""),

    /**
     * No more connections can be made to this remote computer at this time because
     * there are already as many connections as the computer can accept.
     * */
    REQ_NOT_ACCEP(71, "No more connections can be made to this remote computer at this time because " +
            "there are already as many connections as the computer can accept", ""),

    /** The specified printer or disk device has been paused. */
    REDIR_PAUSED(72, "The specified printer or disk device has been paused", ""),

    /** The file exists. */
    FILE_EXISTS(80, "The file exists", ""),

    /** The directory or file cannot be created. */
    CANNOT_MAKE(82, "The directory or file cannot be created", ""),

    /** Fail on INT 24. */
    FAIL_I24(83, "Fail on INT 24", ""),

    /** Storage to process this request is not available. */
    OUT_OF_STRUCTURES(84, "Storage to process this request is not available", ""),

    /** The local device name is already in use. */
    ALREADY_ASSIGNED(85, "The local device name is already in use", ""),

    /** The specified network password is not correct. */
    INVALID_PASSWORD(86, "The specified network password is not correct", ""),

    /** The parameter is incorrect. */
    INVALID_PARAMETER(87, "The parameter is incorrect", ""),

    /** A write fault occurred on the network. */
    NET_WRITE_FAULT(88, "A write fault occurred on the network", ""),

    /** The system cannot start another process at this time. */
    NO_PROC_SLOTS(89, "The system cannot start another process at this time", ""),

    /** Cannot create another system semaphore. */
    TOO_MANY_SEMAPHORES(100, "Cannot create another system semaphore", ""),

    /** The exclusive semaphore is owned by another process. */
    EXCL_SEM_ALREADY_OWNED(101, "The exclusive semaphore is owned by another process", ""),

    /** The semaphore is set and cannot be closed. */
    SEM_IS_SET(102, "The semaphore is set and cannot be closed", ""),

    /** The semaphore cannot be set again. */
    TOO_MANY_SEM_REQUESTS(103, "The semaphore cannot be set again", ""),

    /** Cannot request exclusive semaphores at interrupt time. */
    INVALID_AT_INTERRUPT_TIME(104, "Cannot request exclusive semaphores at interrupt time", ""),

    /** The previous ownership of this semaphore has ended. */
    SEM_OWNER_DIED(105, "The previous ownership of this semaphore has ended", ""),

    /** Insert the diskette for drive. */
    SEM_USER_LIMIT(106, "Insert the diskette for drive", ""),

    /** The program stopped because an alternate diskette was not inserted. */
    DISK_CHANGE(107, "The program stopped because an alternate diskette was not inserted", ""),

    /** The disk is in use or locked by another process. */
    DRIVE_LOCKED(108, "The disk is in use or locked by another process", ""),

    /** The pipe has been ended. */
    BROKEN_PIPE(109, "The pipe has been ended", ""),

    /** The system cannot open the device or file specified. */
    OPEN_FAILED(110, "The system cannot open the device or file specified", ""),

    /** The file name is too long. */
    BUFFER_OVERFLOW(111, "The file name is too long", ""),

    /** There is not enough space on the disk. */
    DISK_FULL(112, "There is not enough space on the disk", ""),

    /** No more internal file identifiers available. */
    NO_MORE_SEARCH_HANDLES(113, "No more internal file identifiers available", ""),

    /** The target internal file identifier is incorrect. */
    INVALID_TARGET_HANDLE(114, "The target internal file identifier is incorrect", ""),

    /** The IOCTL call made by the application program is not correct. */
    INVALID_CATEGORY(117, "The IOCTL call made by the application program is not correct", ""),

    /** The verify-on-write switch parameter value is not correct. */
    INVALID_VERIFY_SWITCH(118, "The verify-on-write switch parameter value is not correct", ""),

    /** The system does not support the command requested. */
    BAD_DRIVER_LEVEL(119, "The system does not support the command requested", ""),

    /** This function is not supported on this system. */
    CALL_NOT_IMPLEMENTED(120, "This function is not supported on this system", ""),

    /** The semaphore timeout period has expired. */
    SEM_TIMEOUT(121, "The semaphore timeout period has expired", ""),

    /** The data area passed to a system call is too small. */
    INSUFFICIENT_BUFFER(122, "The data area passed to a system call is too small", ""),

    /** The filename, directory name, or volume label syntax is incorrect. */
    INVALID_NAME(123, "The filename, directory name, or volume label syntax is incorrect", ""),

    /** The system call level is not correct. */
    INVALID_LEVEL(124, "The system call level is not correct", ""),

    /** The disk has no volume label. */
    NO_VOLUME_LABEL(125, "The disk has no volume label", ""),

    /** The specified module could not be found. */
    MOD_NOT_FOUND(126, "The specified module could not be found", ""),

    /** The specified procedure could not be found. */
    PROC_NOT_FOUND(127, "The specified procedure could not be found", ""),

    /** There are no child processes to wait for. */
    WAIT_NO_CHILDREN(128, "There are no child processes to wait for", "");

    /** Numeric code of exit status. */
    private final int code;

    /** Meaning of exit status. */
    private final String meaning;

    /** Comment on exit status. */
    private final String comment;


    WinExitStatus(int code, String meaning, String comment) {
        this.code = code;
        this.meaning = meaning;
        this.comment = comment;
    }

    /** {@inheritDoc} */
    public int code() { return code; }

    /** {@inheritDoc} */
    public String meaning() { return meaning; }

    /** {@inheritDoc} */
    public String comment() { return comment; }

}
